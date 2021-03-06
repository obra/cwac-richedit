/***
  Copyright (c) 2008-2011 CommonsWare, LLC
  
  Licensed under the Apache License, Version 2.0 (the "License"); you may
  not use this file except in compliance with the License. You may obtain
  a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/    

package com.commonsware.cwac.richedit;

import android.widget.EditText;

class Selection {
  int start;
  int end;

  Selection(EditText editor) {
    start=editor.getSelectionStart();
    end=editor.getSelectionEnd();

    if (start > end) {
      int temp=end;
      end=start;
      start=temp;
    }
  }

  boolean isEmpty() {
    return(start == end);
  }
  
  void apply(EditText editor) {
    editor.setSelection(start, end);
  }
}