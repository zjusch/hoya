/*
 * Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */











package org.apache.hadoop.hoya.yarn.cluster.flexing

import groovy.util.logging.Commons
import org.apache.hadoop.hoya.yarn.cluster.YarnMiniClusterTestBase
import org.junit.Test

/**
 * Create a master against the File:// fs
 */
@Commons
class TestClusterFlex1To1 extends YarnMiniClusterTestBase {

  @Test
  public void testClusterFlexPersistent() throws Throwable {
    assert !flexClusterTestRun("TestClusterFlex1To1", 1, 1, true, true)
  }

/*
  @Test
  public void testClusterFlexTransient() throws Throwable {
    assert !flexClusterTestRun("TestClusterFlex1To1-transient", 1, 1, true, false)
  }
*/


}
