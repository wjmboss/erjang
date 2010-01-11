/**
 * This file is part of Erjang - A JVM-based Erlang VM
 *
 * Copyright (c) 2009 by Trifork
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
 **/


package erjang.driver;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;

import erjang.EObject;

/**
 * 
 */
public abstract class EDriverControl {

	/**
	 * 
	 */
	protected void stop() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	protected void timeout() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param bufv
	 * @throws IOException 
	 */
	protected void outputv(ByteBuffer[] bufv) throws IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param buf
	 */
	public void outputv(ByteBuffer buf) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param op
	 * @param out
	 * @return
	 */
	protected ByteBuffer control(int op, ByteBuffer[] out) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param ch
	 */
	protected void readyInput(SelectableChannel ch) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param ch
	 */
	protected void readyOutput(SelectableChannel ch) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param ch
	 */
	public void readyConnect(SelectableChannel ch) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param ch
	 */
	public void readyAccept(SelectableChannel ch) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param ch
	 */
	protected void stopSelect(SelectableChannel ch) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param job
	 */
	protected void readyAsync(EAsync job) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param op
	 * @param data
	 * @return
	 */
	protected EObject call(int op, EObject data) {
		// TODO Auto-generated method stub
		return null;
	}

}