package org.occiware.clouddesigner.occi2ecore;

import java.io.File;

public interface IConverterPaths {
	String WORKSPACE_PATH = new File(new File("").getAbsolutePath())
			.getParentFile().getParent();

	/*
	 * OCCI Extensions
	 */
	String CORE_EXT_PATH = WORKSPACE_PATH + "/metamodel/extensions/Core.xmi";

	String INFRA_EXT_PATH = WORKSPACE_PATH
			+ "/metamodel/extensions/Infrastructure.xmi";

	String DOCKER_EXT_PATH = WORKSPACE_PATH + "/metamodel/docker/Docker.xmi";

	/*
	 * OCCI Metamodels
	 */
	String INFRA_MM_PATH = WORKSPACE_PATH
			+ "/clouddesigner/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore";

	String DOCKER_MM_PATH = WORKSPACE_PATH
			+ "/clouddesigner/org.occiware.clouddesigner.occi.docker/model/Docker.ecore";

	/*
	 * OCCI Samples
	 */
	String DOCKER_SAMPLE1_OCCI_PATH = WORKSPACE_PATH
			+ "/metamodel/docker/first-docker-configuration.xmi";

	String DOCKER_SAMPLE2_OCCI_PATH = WORKSPACE_PATH
			+ "/metamodel/docker/demo/demo.xmi";

	/*
	 * DSL Samples
	 */
	String DOCKER_SAMPLE1_DSL_PATH = WORKSPACE_PATH
			+ "/clouddesigner/org.occiware.clouddesigner.occi.docker.samples/first-docker-configuration.xmi";

	String DOCKER_SAMPLE2_DSL_PATH = WORKSPACE_PATH
			+ "/clouddesigner/org.occiware.clouddesigner.occi.docker.samples/demo.xmi";

}