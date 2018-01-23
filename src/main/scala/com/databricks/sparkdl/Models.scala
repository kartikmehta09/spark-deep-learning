/*
 * Copyright 2017 Databricks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package com.databricks.sparkdl

import java.nio.file.Paths
import org.tensorflow.framework.GraphDef
import com.databricks.sparkdl.DeepImageFeaturizer.NamedImageModel

/**
 * File generated by sparkdl.utils.generate_app_models.
 * Models defined in sparkdl.transformers.keras_applications.py
 */
 
object Models {
 /**
  * A simple test graph used for testing DeepImageFeaturizer.
  */
 private[sparkdl] object TestNet extends NamedImageModel {

    override val name = "_test"
    override val height = 60
    override val width = 40
    override val graphInputNode = "input"
    override val graphOutputNode = "sparkdl_output__"

    override def graph: GraphDef = {
      val file = getClass.getResource("/sparkdl/test_net.pb").getFile
      ModelFetcher.importGraph(Paths.get(file), "jVCEKp1bV53eib8d8OKreTH4fHu/Ji5NHMOsgdVwbMg=")
        .getOrElse {
          throw new Exception(s"""The hash of file $file did not match the expected value.""".stripMargin)
        }
    }
  }
  
  /**
   * Model provided by Keras. All cotributions by Keras are provided subject to the
   * MIT license located at https://github.com/fchollet/keras/blob/master/LICENSE
   * and subject to the below additional copyrights and licenses.
   *
   * Copyright 2016 The TensorFlow Authors.  All rights reserved.
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
  private[sparkdl] object InceptionV3 extends NamedImageModel {
    override val name = "InceptionV3"
    override val height = 299
    override val width = 299
    override val graphInputNode = name + "_input"
    override val graphOutputNode = name + "_sparkdl_output__"
  
    override def graph: GraphDef = ModelFetcher.getFromWeb(
        "https://s3-us-west-2.amazonaws.com/spark-deep-learning-models/sparkdl-InceptionV3_v1.pb",
        fileName = "sparkdl-inceptionV3_v1.pb",
        base64Hash = "8OImhbhTEoacQhEKRDjavT0xpMPH2pH3HQrOAZ1NUtA="
    )
  }
    
  /**
   * Model provided by Keras. All cotributions by Keras are provided subject to the
   * MIT license located at https://github.com/fchollet/keras/blob/master/LICENSE
   * and subject to the below additional copyrights and licenses.
   *
   * The MIT License (MIT)
   *
   * Copyright (c) 2016 Shaoqing Ren
   *
   * Permission is hereby granted, free of charge, to any person obtaining a copy
   * of this software and associated documentation files (the "Software"), to deal
   * in the Software without restriction, including without limitation the rights
   * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
   * copies of the Software, and to permit persons to whom the Software is
   * furnished to do so, subject to the following conditions:
   *
   * The above copyright notice and this permission notice shall be included in all
   * copies or substantial portions of the Software.
   *
   * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
   * SOFTWARE.
   */
  private[sparkdl] object ResNet50 extends NamedImageModel {
    override val name = "ResNet50"
    override val height = 224
    override val width = 224
    override val graphInputNode = name + "_input"
    override val graphOutputNode = name + "_sparkdl_output__"
  
    override def graph: GraphDef = ModelFetcher.getFromWeb(
        "https://s3-us-west-2.amazonaws.com/spark-deep-learning-models/sparkdl-ResNet50_v1.pb",
        fileName = "sparkdl-inceptionV3_v1.pb",
        base64Hash = "yrnfcbi84GxJjo30eGkl27GAHxig0JsC106v5wQr3gE="
    )
  }
    
  /**
   * Model provided by Keras. All cotributions by Keras are provided subject to the
   * MIT license located at https://github.com/fchollet/keras/blob/master/LICENSE
   * and subject to the below additional copyrights and licenses.
   *
   * Copyright 2014 Oxford University
   *
   * Licensed under the Creative Commons Attribution License CC BY 4.0 ("License").
   * You may obtain a copy of the License at
   *
   *     https://creativecommons.org/licenses/by/4.0/
   *
   */
  private[sparkdl] object VGG16 extends NamedImageModel {
    override val name = "VGG16"
    override val height = 224
    override val width = 224
    override val graphInputNode = name + "_input"
    override val graphOutputNode = name + "_sparkdl_output__"
  
    override def graph: GraphDef = ModelFetcher.getFromWeb(
        "https://s3-us-west-2.amazonaws.com/spark-deep-learning-models/sparkdl-VGG16_v1.pb",
        fileName = "sparkdl-inceptionV3_v1.pb",
        base64Hash = "ILVEakOf5arJP11QK4GYDSy8grlUkcfyMR3NqnopXJY="
    )
  }
    
  /**
   * Model provided by Keras. All cotributions by Keras are provided subject to the
   * MIT license located at https://github.com/fchollet/keras/blob/master/LICENSE
   * and subject to the below additional copyrights and licenses.
   *
   * Copyright 2014 Oxford University
   *
   * Licensed under the Creative Commons Attribution License CC BY 4.0 ("License").
   * You may obtain a copy of the License at
   *
   *     https://creativecommons.org/licenses/by/4.0/
   *
   */
  private[sparkdl] object VGG19 extends NamedImageModel {
    override val name = "VGG19"
    override val height = 224
    override val width = 224
    override val graphInputNode = name + "_input"
    override val graphOutputNode = name + "_sparkdl_output__"
  
    override def graph: GraphDef = ModelFetcher.getFromWeb(
        "https://s3-us-west-2.amazonaws.com/spark-deep-learning-models/sparkdl-VGG19_v1.pb",
        fileName = "sparkdl-inceptionV3_v1.pb",
        base64Hash = "Bq+lSRfPr/Ia0GdkRNBrLhk/cDEEPfHBdOwyVdIm3u4="
    )
  }
    
  /**
   * Model provided by Keras. All cotributions by Keras are provided subject to the
   * MIT license located at https://github.com/fchollet/keras/blob/master/LICENSE.
   */
  private[sparkdl] object Xception extends NamedImageModel {
    override val name = "Xception"
    override val height = 299
    override val width = 299
    override val graphInputNode = name + "_input"
    override val graphOutputNode = name + "_sparkdl_output__"
  
    override def graph: GraphDef = ModelFetcher.getFromWeb(
        "https://s3-us-west-2.amazonaws.com/spark-deep-learning-models/sparkdl-Xception_v1.pb",
        fileName = "sparkdl-inceptionV3_v1.pb",
        base64Hash = "yUmqmUDfL/0lLI9rukQ5a+v7n2dDXHO4E3OjdhHB5Eo="
    )
  }
  
  val _supportedModels = Set[NamedImageModel](TestNet,VGG16,Xception,VGG19,ResNet50,InceptionV3)
}

