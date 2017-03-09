/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.hadoop.scm;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * This class contains constants for configuration keys used in SCM
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public final class ScmConfigKeys {
  public static final String DFS_CONTAINER_IPC_PORT =
      "dfs.container.ipc";
  public static final int DFS_CONTAINER_IPC_PORT_DEFAULT = 50011;

  public static final String SCM_CONTAINER_CLIENT_STALE_THRESHOLD_KEY =
      "scm.container.client.idle.threshold";
  public static final int SCM_CONTAINER_CLIENT_STALE_THRESHOLD_DEFAULT =
      10000;

  // TODO : this is copied from OzoneConsts, may need to move to a better place
  public static final int CHUNK_SIZE = 1 * 1024 * 1024; // 1 MB
}