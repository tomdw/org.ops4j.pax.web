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
 package org.ops4j.pax.web.extender.samples.whiteboard.internal;

import java.util.HashMap;
import java.util.Map;

import org.ops4j.pax.web.extender.whiteboard.HttpContextMapping;
import org.osgi.service.http.HttpContext;

public class WhiteboardHttpContextMapping implements HttpContextMapping {

	private final String contextId;
	private final String contextPath;
	private final Map<String, String> params;

	public WhiteboardHttpContextMapping(String httpContextId,
			String contextPath, Map<String, String> params) {
		this.contextId = httpContextId;
		this.contextPath = contextPath;
		this.params = new HashMap<String, String>(params);
	}

	@Override
	public String getHttpContextId() {
		return contextId;
	}

	@Override
	public String getPath() {
		return contextPath;
	}

	@Override
	public Map<String, String> getParameters() {
		return params;
	}

	@Override
	public HttpContext getHttpContext() {
		return null;
	}

}
