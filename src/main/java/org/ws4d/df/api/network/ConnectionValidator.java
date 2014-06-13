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
package org.ws4d.df.api.network;

import org.ws4d.df.api.comp.type.ComponentType;
import org.ws4d.df.api.exception.InvalidConnectionException;

public interface ConnectionValidator {

	public void setNetworlBuilder(NetworkBuilder networkBuilder);
	
	public void checkConnection(ComponentType sender, String outPortName, int outIndex,
			ComponentType receiver, String inPortName, int inIndex) throws InvalidConnectionException;
	
	public void checkInitialization(ComponentType sender, String inPortName, int index,
            Object packet, boolean isStatic) throws InvalidConnectionException;
	
}
