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
 * This interface represents an out port instance
 * 
 * @author Elmar Zeeb
 *
 */
public interface OutPort extends Port {

    /**
     * Method for sending a data packet from an outgoing component port. The
     * method may block if the capacity of buffered outgoing packets is reached.
     *
     * @param packet
     *            packet to send
     */
    void send(Object packet);
    
    /**
     * Method checks if a call to send() would block
     * 
     * @return true if packet queue is full, false otherwise.
     */
    boolean sendWouldBlock();

}