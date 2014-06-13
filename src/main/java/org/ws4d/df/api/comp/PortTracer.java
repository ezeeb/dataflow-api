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
 * This interface can be used to trace port changes and thus trace
 * data flow in networks
 * 
 * @author Elmar Zeeb
 * 
 */
public interface PortTracer {

	/**
	 * Called by the runtime when an OutPort sends a packet.
	 * 
	 * @param port Outport where packet is sent.
	 * @param packet packet that is sent.
	 */
	
    public void port_send(OutPort port, Object packet);

	/**
	 * Called by the runtime when an InPort receives a packet.
	 * 
	 * @param port Outport where packet is received.
	 * @param packet packet that was received.
	 */
    public void port_recv(InPort port, Object packet);
    
	/**
	 * Called by the runtime when a Port is closed
	 * 
	 * @param port port that was closed.
	 */
    public void port_close(Port port);

}
