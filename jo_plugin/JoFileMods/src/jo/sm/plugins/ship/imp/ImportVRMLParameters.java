/**
 * Copyright 2014 
 * SMEdit https://github.com/StarMade/SMEdit
 * SMTools https://github.com/StarMade/SMTools
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **/
package jo.sm.plugins.ship.imp;

import jo.sm.ui.act.plugin.Description;

/**
 * @Auther Jo Jaquinta for SMEdit Classic - version 1.0
 **/
@Description(displayName = "Import VRML Model", shortDescription = "Import a model in VRML format from your disk")
public class ImportVRMLParameters {

    @Description(displayName = "File", shortDescription = "Path to VRML model")
    private String mFile;
    @Description(displayName = "Longest Dimension", shortDescription = "Scale the model to this size")
    private int mLongestDimension;

    public ImportVRMLParameters() {
        mLongestDimension = 100;
    }

    public String getFile() {
        return mFile;
    }

    public void setFile(String file) {
        mFile = file;
    }

    public int getLongestDimension() {
        return mLongestDimension;
    }

    public void setLongestDimension(int longestDimension) {
        mLongestDimension = longestDimension;
    }
}
