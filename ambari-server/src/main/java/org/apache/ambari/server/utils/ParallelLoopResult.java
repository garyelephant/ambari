/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.utils;

import java.util.List;

/**
 * Provides completion status and results of a {@link Parallel} loop
 * @param <R> Result type
 */
public class ParallelLoopResult<R> {
  private boolean isCompleted;
  private List<R> result;

  /**
   * Flag to indicate if the parallel loop completed all iterations
   * @return
   */
  public boolean getIsCompleted() {
    return isCompleted;
  }

  /**
   * Flag to indicate if the parallel loop completed all iterations
   * @return
   */
  public void setIsCompleted(boolean completed) {
    isCompleted = completed;
  }

  public List<R> getResult() {
    return result;
  }

  public void setResult(List<R> result) {
    this.result = result;
  }

  /**
   * Constructor
   * @param completed Indicates if the parallel loop completed all iterations
   * @param result    Results of parallel loop. Results could be partially completed.
   */
  public ParallelLoopResult(boolean completed, List<R> result) {
    isCompleted = completed;
    this.result = result;
  }
}
