package org.occiware.clouddesigner.occi.docker.preference.preferences;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.occiware.clouddesigner.occi.docker.preference.Activator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreferenceValues extends AbstractHandler{

	// Initialize logger for PreferenceValues.
	private static Logger LOGGER = LoggerFactory.getLogger(PreferenceValues.class);
	
	
	private String username;
	
	private String password;
	
	private String email;

	public PreferenceValues() {
		String username = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_USERNAME);
		setUsername(username);
		
		String password = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_PASSWORD);
		setPassword(password);
		
		String email = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_EMAIL);
		setEmail(email);
		
		Activator.getDefault().getPreferenceStore()
        .addPropertyChangeListener(new IPropertyChangeListener() {
          @Override
          public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == PreferenceConstants.P_STRING_USERNAME) {
            	setUsername(event.getNewValue().toString());
            }
            if (event.getProperty() == PreferenceConstants.P_STRING_PASSWORD) {
            	setPassword(event.getNewValue().toString());
              }
            if (event.getProperty() == PreferenceConstants.P_STRING_EMAIL) {
            	setEmail(event.getNewValue().toString());
              }

          }
        });		

	}
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		String username = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_USERNAME);
		setUsername(username);
		
		MessageDialog.openInformation(shell, "Info", username);
		LOGGER.info(username + "\n\n\n\n\n");
		
		String password = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_PASSWORD);
		setPassword(password);
		LOGGER.info(password + "\n\n\n\n\n");
		
		String email = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_EMAIL);
		setEmail(email);
		LOGGER.info(email + "\n\n\n\n\n");
		
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
