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

/**
 * This interface must be implemented by components to be part of a network
 * 
 * @author Elmar Zeeb
 *
 */
public interface Component {

	/**
	 * This method is called to initialize a component and pass the
	 * {@link ComponentContext}.
	 * 
	 * @param context
	 *            interface to the network and the runtime.
	 */
	public void init(ComponentContext context);

	/**
     * This method is called by the runtime when the component enters active
     * state.
     */
	public void execute();

	/**
	 * Not yet implemented
	 */
	public void finish(); // TODO: raus ?

	/**
	 * This method will be called in networks started with the start() method
	 * after each futher start() method call.
	 */
	public void reset();

	/**
	 * This method will be called when a network teminates.
	 */
	public void terminate();

}
