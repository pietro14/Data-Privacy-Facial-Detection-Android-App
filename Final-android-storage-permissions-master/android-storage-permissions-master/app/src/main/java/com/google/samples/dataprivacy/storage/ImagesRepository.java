/*
 * Copyright 2017 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.dataprivacy.storage;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.google.samples.dataprivacy.model.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Contract for the data store of images.
 */
public interface ImagesRepository {
    String saveImage(Bitmap image);

    void deleteImage(String path);

    List<Image> getImages();

    List<Image> getSomeImages(int numberFaces);

    Bitmap getImage(String path);
}
