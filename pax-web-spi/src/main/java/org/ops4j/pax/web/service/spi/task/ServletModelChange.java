/*
 * Copyright 2020 OPS4J.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service.spi.task;

import java.util.LinkedList;
import java.util.List;

import org.ops4j.pax.web.service.spi.model.ServerModel;
import org.ops4j.pax.web.service.spi.model.elements.ServletModel;

public class ServletModelChange extends Change {

	private final ServerModel serverModel;
	private ServletModel servletModel;
	private final List<ServletModel> servletModels = new LinkedList<>();
	private boolean disabled;

	public ServletModelChange(OpCode op, ServerModel serverModel, ServletModel servletModel) {
		this(op, serverModel, servletModel, false);
	}

	public ServletModelChange(OpCode op, ServerModel serverModel, List<ServletModel> servletModels) {
		super(op);
		this.serverModel = serverModel;
		this.servletModels.addAll(servletModels);
	}

	public ServletModelChange(OpCode op, ServerModel serverModel, ServletModel servletModel, boolean disabled) {
		super(op);
		this.serverModel = serverModel;
		this.servletModel = servletModel;
		this.servletModels.add(servletModel);
		this.disabled = disabled;
	}

	public ServerModel getServerModel() {
		return serverModel;
	}

	public ServletModel getServletModel() {
		return servletModel;
	}

	public List<ServletModel> getServletModels() {
		return servletModels;
	}

	public boolean isDisabled() {
		return disabled;
	}

	@Override
	public void accept(BatchVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return getKind() + ": " + servletModel + (disabled ? " (disabled)" : " (enabled)");
	}

}