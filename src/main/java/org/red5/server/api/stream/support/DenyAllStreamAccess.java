/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2014 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.server.api.stream.support;

import org.red5.server.api.scope.IScope;
import org.red5.server.api.stream.IStreamPlaybackSecurity;
import org.red5.server.api.stream.IStreamPublishSecurity;

/**
 * Stream security handler that denies access to all streams.
 * 
 * @author The Red5 Project
 * @author Joachim Bauch (jojo@struktur.de)
 */
public class DenyAllStreamAccess implements IStreamPublishSecurity, IStreamPlaybackSecurity {

	/** {@inheritDoc} */
	public boolean isPublishAllowed(IScope scope, String name, String mode) {
		return false;
	}

	/** {@inheritDoc} */
	public boolean isPlaybackAllowed(IScope scope, String name, int start, int length, boolean flushPlaylist) {
		return false;
	}

}
