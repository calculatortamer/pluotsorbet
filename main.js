/* -*- Mode: Java; tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* vim: set shiftwidth=2 tabstop=2 autoindent cindent expandtab: */

'use strict';

function load(file, cb) {
  var xhr = new XMLHttpRequest();
  xhr.open("GET", file, true);
  xhr.responseType = "arraybuffer";
  xhr.onload = function () {
    cb(xhr.response);
  }
  xhr.send(null);
}

function runTest(name, cb) {
  var jvm = new JVM();
  load("java/cldc1.1.1.jar", function (data) {
    jvm.addPath("java/cldc1.1.1.jar", data);
    load(name, function (data) {
      jvm.addPath(name, data);
      jvm.loadClassFile(name);
      jvm.start();
      cb && cb();
    });
  });
}

runTest("tests/TestPrintln.class")
