/*
 * Copyright 2017 Antonio Alonso Dominguez
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
 */

package cron4s.expr

import cron4s.CronField
import cron4s.testkit.Cron4sLawSuite
import cron4s.testkit.discipline.ExprTests
import cron4s.testkit.gen.ArbitraryEveryNode

/**
  * Created by alonsodomin on 01/08/2016.
  */
class EveryNodeSpec extends Cron4sLawSuite with ArbitraryEveryNode {
  import CronField._

  checkAll("Every[Second]", ExprTests[EveryNode, Second].expr)
  checkAll("Every[Minute]", ExprTests[EveryNode, Minute].expr)
  checkAll("Every[Hour]", ExprTests[EveryNode, Hour].expr)
  checkAll("Every[DayOfMonth]", ExprTests[EveryNode, DayOfMonth].expr)
  checkAll("Every[Month]", ExprTests[EveryNode, Month].expr)
  checkAll("Every[DayOfWeek]", ExprTests[EveryNode, DayOfWeek].expr)

}
