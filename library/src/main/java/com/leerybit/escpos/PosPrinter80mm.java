package com.leerybit.escpos;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

import com.leerybit.escpos.bluetooth.BTService;
import com.leerybit.escpos.bluetooth.SearchPrinterDialog;

import org.apache.commons.lang3.ArrayUtils;

import java.util.List;

/**
 * Copyright 2015 LeeryBit
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class PosPrinter80mm extends PosPrinter {

  public PosPrinter80mm(Activity activity) {
    super(activity);
  }

  @Override
  int getCharsOnLine() {
    return 48;
  }
}