/*
 * generated by Xtext
 */
package org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.occiware.clouddesigner.occi.xtext.services.OCCIGrammarAccess;

public class OCCIParser extends AbstractContentAssistParser {
	
	@Inject
	private OCCIGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal.InternalOCCIParser createParser() {
		org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal.InternalOCCIParser result = new org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal.InternalOCCIParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEDataTypeAccess().getAlternatives(), "rule__EDataType__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getExtensionAccess().getGroup(), "rule__Extension__Group__0");
					put(grammarAccess.getExtensionAccess().getGroup_5(), "rule__Extension__Group_5__0");
					put(grammarAccess.getExtensionAccess().getGroup_5_3(), "rule__Extension__Group_5_3__0");
					put(grammarAccess.getExtensionAccess().getGroup_6(), "rule__Extension__Group_6__0");
					put(grammarAccess.getExtensionAccess().getGroup_6_3(), "rule__Extension__Group_6_3__0");
					put(grammarAccess.getExtensionAccess().getGroup_7(), "rule__Extension__Group_7__0");
					put(grammarAccess.getExtensionAccess().getGroup_7_3(), "rule__Extension__Group_7_3__0");
					put(grammarAccess.getKindAccess().getGroup(), "rule__Kind__Group__0");
					put(grammarAccess.getKindAccess().getGroup_5(), "rule__Kind__Group_5__0");
					put(grammarAccess.getKindAccess().getGroup_6(), "rule__Kind__Group_6__0");
					put(grammarAccess.getKindAccess().getGroup_7(), "rule__Kind__Group_7__0");
					put(grammarAccess.getKindAccess().getGroup_7_3(), "rule__Kind__Group_7_3__0");
					put(grammarAccess.getKindAccess().getGroup_8(), "rule__Kind__Group_8__0");
					put(grammarAccess.getKindAccess().getGroup_8_3(), "rule__Kind__Group_8_3__0");
					put(grammarAccess.getMixinAccess().getGroup(), "rule__Mixin__Group__0");
					put(grammarAccess.getMixinAccess().getGroup_5(), "rule__Mixin__Group_5__0");
					put(grammarAccess.getMixinAccess().getGroup_6(), "rule__Mixin__Group_6__0");
					put(grammarAccess.getMixinAccess().getGroup_6_3(), "rule__Mixin__Group_6_3__0");
					put(grammarAccess.getMixinAccess().getGroup_7(), "rule__Mixin__Group_7__0");
					put(grammarAccess.getMixinAccess().getGroup_7_3(), "rule__Mixin__Group_7_3__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_3(), "rule__Attribute__Group_3__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_5(), "rule__Attribute__Group_5__0");
					put(grammarAccess.getAttributeAccess().getGroup_6(), "rule__Attribute__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_5(), "rule__Action__Group_5__0");
					put(grammarAccess.getActionAccess().getGroup_6(), "rule__Action__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup_6_3(), "rule__Action__Group_6_3__0");
					put(grammarAccess.getEEnumAccess().getGroup(), "rule__EEnum__Group__0");
					put(grammarAccess.getEEnumAccess().getGroup_4(), "rule__EEnum__Group_4__0");
					put(grammarAccess.getEEnumAccess().getGroup_5(), "rule__EEnum__Group_5__0");
					put(grammarAccess.getEEnumAccess().getGroup_6(), "rule__EEnum__Group_6__0");
					put(grammarAccess.getEEnumAccess().getGroup_7(), "rule__EEnum__Group_7__0");
					put(grammarAccess.getEEnumAccess().getGroup_7_3(), "rule__EEnum__Group_7_3__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup(), "rule__EEnumLiteral__Group__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_4(), "rule__EEnumLiteral__Group_4__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_5(), "rule__EEnumLiteral__Group_5__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup(), "rule__EDataType_Impl__Group__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_4(), "rule__EDataType_Impl__Group_4__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_5(), "rule__EDataType_Impl__Group_5__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_6(), "rule__EDataType_Impl__Group_6__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getExtensionAccess().getNameAssignment_1(), "rule__Extension__NameAssignment_1");
					put(grammarAccess.getExtensionAccess().getSchemeAssignment_4(), "rule__Extension__SchemeAssignment_4");
					put(grammarAccess.getExtensionAccess().getImportAssignment_5_2(), "rule__Extension__ImportAssignment_5_2");
					put(grammarAccess.getExtensionAccess().getImportAssignment_5_3_1(), "rule__Extension__ImportAssignment_5_3_1");
					put(grammarAccess.getExtensionAccess().getKindsAssignment_6_2(), "rule__Extension__KindsAssignment_6_2");
					put(grammarAccess.getExtensionAccess().getKindsAssignment_6_3_1(), "rule__Extension__KindsAssignment_6_3_1");
					put(grammarAccess.getExtensionAccess().getMixinsAssignment_7_2(), "rule__Extension__MixinsAssignment_7_2");
					put(grammarAccess.getExtensionAccess().getMixinsAssignment_7_3_1(), "rule__Extension__MixinsAssignment_7_3_1");
					put(grammarAccess.getKindAccess().getTermAssignment_1(), "rule__Kind__TermAssignment_1");
					put(grammarAccess.getKindAccess().getSchemeAssignment_4(), "rule__Kind__SchemeAssignment_4");
					put(grammarAccess.getKindAccess().getTitleAssignment_5_1(), "rule__Kind__TitleAssignment_5_1");
					put(grammarAccess.getKindAccess().getParentAssignment_6_1(), "rule__Kind__ParentAssignment_6_1");
					put(grammarAccess.getKindAccess().getAttributesAssignment_7_2(), "rule__Kind__AttributesAssignment_7_2");
					put(grammarAccess.getKindAccess().getAttributesAssignment_7_3_1(), "rule__Kind__AttributesAssignment_7_3_1");
					put(grammarAccess.getKindAccess().getActionsAssignment_8_2(), "rule__Kind__ActionsAssignment_8_2");
					put(grammarAccess.getKindAccess().getActionsAssignment_8_3_1(), "rule__Kind__ActionsAssignment_8_3_1");
					put(grammarAccess.getMixinAccess().getTermAssignment_1(), "rule__Mixin__TermAssignment_1");
					put(grammarAccess.getMixinAccess().getSchemeAssignment_4(), "rule__Mixin__SchemeAssignment_4");
					put(grammarAccess.getMixinAccess().getTitleAssignment_5_1(), "rule__Mixin__TitleAssignment_5_1");
					put(grammarAccess.getMixinAccess().getAttributesAssignment_6_2(), "rule__Mixin__AttributesAssignment_6_2");
					put(grammarAccess.getMixinAccess().getAttributesAssignment_6_3_1(), "rule__Mixin__AttributesAssignment_6_3_1");
					put(grammarAccess.getMixinAccess().getActionsAssignment_7_2(), "rule__Mixin__ActionsAssignment_7_2");
					put(grammarAccess.getMixinAccess().getActionsAssignment_7_3_1(), "rule__Mixin__ActionsAssignment_7_3_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getMutableAssignment_3_1(), "rule__Attribute__MutableAssignment_3_1");
					put(grammarAccess.getAttributeAccess().getRequiredAssignment_4_1(), "rule__Attribute__RequiredAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getDefaultAssignment_5_1(), "rule__Attribute__DefaultAssignment_5_1");
					put(grammarAccess.getAttributeAccess().getDescriptionAssignment_6_1(), "rule__Attribute__DescriptionAssignment_6_1");
					put(grammarAccess.getActionAccess().getTermAssignment_1(), "rule__Action__TermAssignment_1");
					put(grammarAccess.getActionAccess().getSchemeAssignment_4(), "rule__Action__SchemeAssignment_4");
					put(grammarAccess.getActionAccess().getTitleAssignment_5_1(), "rule__Action__TitleAssignment_5_1");
					put(grammarAccess.getActionAccess().getAttributesAssignment_6_2(), "rule__Action__AttributesAssignment_6_2");
					put(grammarAccess.getActionAccess().getAttributesAssignment_6_3_1(), "rule__Action__AttributesAssignment_6_3_1");
					put(grammarAccess.getEEnumAccess().getNameAssignment_2(), "rule__EEnum__NameAssignment_2");
					put(grammarAccess.getEEnumAccess().getInstanceClassNameAssignment_4_1(), "rule__EEnum__InstanceClassNameAssignment_4_1");
					put(grammarAccess.getEEnumAccess().getInstanceTypeNameAssignment_5_1(), "rule__EEnum__InstanceTypeNameAssignment_5_1");
					put(grammarAccess.getEEnumAccess().getSerializableAssignment_6_1(), "rule__EEnum__SerializableAssignment_6_1");
					put(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_2(), "rule__EEnum__ELiteralsAssignment_7_2");
					put(grammarAccess.getEEnumAccess().getELiteralsAssignment_7_3_1(), "rule__EEnum__ELiteralsAssignment_7_3_1");
					put(grammarAccess.getEEnumLiteralAccess().getNameAssignment_2(), "rule__EEnumLiteral__NameAssignment_2");
					put(grammarAccess.getEEnumLiteralAccess().getValueAssignment_4_1(), "rule__EEnumLiteral__ValueAssignment_4_1");
					put(grammarAccess.getEEnumLiteralAccess().getLiteralAssignment_5_1(), "rule__EEnumLiteral__LiteralAssignment_5_1");
					put(grammarAccess.getEDataType_ImplAccess().getNameAssignment_2(), "rule__EDataType_Impl__NameAssignment_2");
					put(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameAssignment_4_1(), "rule__EDataType_Impl__InstanceClassNameAssignment_4_1");
					put(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameAssignment_5_1(), "rule__EDataType_Impl__InstanceTypeNameAssignment_5_1");
					put(grammarAccess.getEDataType_ImplAccess().getSerializableAssignment_6_1(), "rule__EDataType_Impl__SerializableAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal.InternalOCCIParser typedParser = (org.occiware.clouddesigner.occi.xtext.ui.contentassist.antlr.internal.InternalOCCIParser) parser;
			typedParser.entryRuleExtension();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public OCCIGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OCCIGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}