/*
 * Copyright (c) 2017, Salesforce.com, Inc.
 * All rights reserved.
 */

package com.salesforce.op.cli.gen.templates

import com.salesforce.op.features.{FeatureBuilder => FB}
import com.salesforce.op.features.types._

/**
 * This is a template for generating integral feature handling in a generated project
 */
class IntegralFeatureTemplate {
  private[templates] def feature =
  // BEGIN
  FB.Integral[SampleObject]
    .extract(_.codeGeneration_integralField_codeGeneration.toIntegral)
  // END
}