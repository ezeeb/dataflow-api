/**
 * Copyright (C) 2014 PipesBox UG (haftungsbeschränkt) (elmar.zeeb@pipesbox.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ws4d.df.api.comp;

import java.util.List;
import java.util.logging.Logger;

import org.ws4d.df.api.comp.type.ComponentType;
import org.ws4d.df.api.network.Network;
import org.ws4d.df.api.network.NetworkContext;

/**
 * Interface between components and runtime
 * 
 * @author Elmar Zeeb
 * 
 */
public interface ComponentContext {

	/**
	 * @return unique component id
	 */
	public String getComponentId();

	/**
	 * @return {@link ComponentType} related to component
	 */
	public ComponentType getComponentType();

	/**
	 * @return {@link Network} logger
	 */
	public Logger getLogger();

	/**
	 * @return list of in ports
	 */
	public List<InPort> getAllInPorts();

	/**
	 * @return list of out ports
	 */
	public List<OutPort> getAllOutPorts();

	/**
	 * @return {@link NetworkContext} of network this component is part of
	 */
	public NetworkContext getNetwork();
}
