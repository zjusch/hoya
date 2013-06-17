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

package org.apache.hadoop.hoya;


/**
 * Keys and various constants for Hoya
 */
public interface HoyaKeys {

  String HBASE_SITE = "hbase-site.xml";
  String HBASE_TEMPLATE = "hbase-site-template.xml";
  String HBASE_TEMPLATE_RESOURCE = "/conf/" + HBASE_TEMPLATE;
  String APP_TYPE = "HOYA-HBASE";

  String JAVA_FORCE_IPV4 = "-Djava.net.preferIPv4Stack=true";


  /**
   * This is the name of the dir/subdir containing
   * the hbase conf that is propagated via YARN
   */
  String PROPAGATED_CONF_DIR_NAME = "conf";
  
  int HBASE_ZK_PORT = 2181; // HConstants.DEFAULT_ZOOKEPER_CLIENT_PORT;
}
