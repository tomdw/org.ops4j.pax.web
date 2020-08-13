/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.itest.container.jsp;

import org.ops4j.pax.web.itest.container.AbstractControlledTestBase;

/**
 * Regression test for PAXWEB-409.
 *
 * @author Harald Wellmann
 */
public abstract class AbstractJspNoClassesIntegrationTest extends AbstractControlledTestBase {

//	private Bundle installWarBundle;
//
//	@Before
//	public void setUp() throws BundleException, InterruptedException {
//		initWebListener();
//		String bundlePath = "mvn:org.ops4j.pax.web.samples/helloworld-jsp-noclasses/" + VersionUtil.getProjectVersion();
//		installWarBundle = installAndStartBundle(bundlePath);
//		waitForWebListener();
//	}
//
//
//	@After
//	public void tearDown() throws BundleException {
//		if (installWarBundle != null) {
//			installWarBundle.stop();
//			installWarBundle.uninstall();
//		}
//	}
//
//	@Test
//	public void testSimpleJsp() throws Exception {
//		HttpTestClientFactory.createDefaultTestClient()
//				.withResponseAssertion("Response must contain 'Welcome'",
//						resp -> resp.contains("Welcome"))
//				.doGETandExecuteTest("http://localhost:8181/jspnc/welcome.jsp");
//	}

}