public class ShellTestlets {
  static String[] list = {
    "com/sun/midp/crypto/Sha256Test",
    "com/sun/midp/crypto/TestAES",
    "com/sun/midp/crypto/TestARC4",
    "com/sun/midp/crypto/TestDES",
    "com/sun/midp/crypto/TestSHA",
    "gnu/testlet/java/io/ByteArrayInputStream/MarkReset",
    "gnu/testlet/java/io/ByteArrayInputStreamTest",
    "gnu/testlet/java/io/ByteArrayOutputStream/subclass",
    "gnu/testlet/java/io/ByteArrayOutputStream/write",
    "gnu/testlet/java/io/ByteArrayOutputStreamTest",
    "gnu/testlet/java/io/DataInputStreamTest",
    "gnu/testlet/java/io/DataOutputStreamTest",
    "gnu/testlet/java/io/InputStream/Test",
    "gnu/testlet/java/lang/Long/longDivide",
    "gnu/testlet/java/lang/Long/longModulo",
    "gnu/testlet/java/lang/Long/LongTest",
    "gnu/testlet/java/lang/Long/new_Long",
    "gnu/testlet/java/lang/Long/parseLongRadix",
    "gnu/testlet/java/lang/Long/toString",
    "gnu/testlet/java/lang/Math/acos",
    "gnu/testlet/java/lang/Math/asin",
    "gnu/testlet/java/lang/Math/atan",
    "gnu/testlet/java/util/Hashtable/basic",
    "gnu/testlet/java/util/Hashtable/ContainsHash",
    "gnu/testlet/java/util/Hashtable/EnumerateAndModify",
    "gnu/testlet/java/util/Hashtable/HashContains",
    "gnu/testlet/vm/BytecodesTest",
    "gnu/testlet/vm/LongTest",
    "gnu/testlet/vm/MathTest",
    "gnu/testlet/vm/OpsTest",
    "gnu/testlet/vm/StringBufferTest",
    "gnu/testlet/vm/StringTest",
    "gnu/testlet/vm/TestArithmetic",
    "test/org/jikesrvm/basic/core/bytecode/TestArrayAccess",
    "test/org/jikesrvm/basic/core/bytecode/TestCompare",
    "test/org/jikesrvm/basic/core/bytecode/TestConstants",
    "test/org/jikesrvm/basic/core/bytecode/TestFieldAccess",
    "test/org/jikesrvm/basic/core/bytecode/TestInvoke",
    "test/org/jikesrvm/basic/core/bytecode/TestReturn",
    "test/org/jikesrvm/basic/core/bytecode/TestSwitch",
    "test/org/jikesrvm/basic/java/lang/TestMath",
    "gnu/testlet/java/lang/Boolean/BooleanTest",
    "gnu/testlet/java/lang/Boolean/BooleanTest2",
    "gnu/testlet/java/lang/Boolean/equals_Boolean",
    "gnu/testlet/java/lang/Boolean/hashcode_Boolean",
    "gnu/testlet/java/lang/Byte/byteDivide",
    "gnu/testlet/java/lang/Byte/ByteTest",
    "gnu/testlet/java/lang/Byte/new_Byte",
    "gnu/testlet/java/lang/Byte/parseByte",
    "gnu/testlet/java/lang/Byte/parseByteRadix",
    "gnu/testlet/java/lang/Character/CharacterTest",
    "gnu/testlet/java/lang/Character/hash",
    "gnu/testlet/java/lang/Character/to",
    "gnu/testlet/java/lang/Double/DoubleTest",
    "gnu/testlet/vm/ConditionsTest",
    "gnu/testlet/vm/DupTest",
    "test/org/jikesrvm/basic/core/bytecode/TestFloatingRem",
    "test/org/jikesrvm/basic/bugs/R1644449",
    "test/org/jikesrvm/basic/bugs/R1644460",
    "test/org/jikesrvm/basic/bugs/R1644460_B",
    "test/org/jikesrvm/basic/bugs/R1657236",
    "com/sun/cldc/i18n/TestUtfReaders",
    "com/sun/cldc/i18n/UTF_8_Writer_sizeOf",
    "com/sun/cldc/io/TestResourceInputStream",
    "gnu/testlet/java/io/InterruptedIOException/constructor",
    "gnu/testlet/java/io/InterruptedIOException/TryCatch",
    "gnu/testlet/java/io/IOException/constructor",
    "gnu/testlet/java/io/IOException/TryCatch",
    "gnu/testlet/java/io/OutputStream/Test",
    "gnu/testlet/java/io/OutputStreamWriter/jdk11",
    "gnu/testlet/java/io/UnsupportedEncodingException/constructor",
    "gnu/testlet/java/io/UnsupportedEncodingException/TryCatch",
    "gnu/testlet/java/lang/ArithmeticException/constructor",
    "gnu/testlet/java/lang/ArithmeticException/TryCatch",
    "gnu/testlet/java/lang/ArrayIndexOutOfBoundsException/constructor",
    "gnu/testlet/java/lang/ArrayIndexOutOfBoundsException/TryCatch",
    "gnu/testlet/java/lang/ArrayStoreException/constructor",
    "gnu/testlet/java/lang/ArrayStoreException/TryCatch",
    "gnu/testlet/java/lang/Class/isArray",
    "gnu/testlet/java/lang/Class/newInstance",
    "gnu/testlet/java/lang/ClassCastException/constructor",
    "gnu/testlet/java/lang/ClassCastException/TryCatch",
    "gnu/testlet/java/lang/ClassNotFoundException/constructor",
    "gnu/testlet/java/lang/ClassNotFoundException/TryCatch",
    "gnu/testlet/java/lang/Date/DateTest",
    "gnu/testlet/java/lang/Exception/constructor",
    "gnu/testlet/java/lang/Exception/TryCatch",
    "gnu/testlet/java/lang/IllegalAccessException/constructor",
    "gnu/testlet/java/lang/IllegalAccessException/TryCatch",
    "gnu/testlet/java/lang/IllegalArgumentException/constructor",
    "gnu/testlet/java/lang/IllegalArgumentException/TryCatch",
    "gnu/testlet/java/lang/IllegalMonitorStateException/constructor",
    "gnu/testlet/java/lang/IllegalMonitorStateException/TryCatch",
    "gnu/testlet/java/lang/IllegalStateException/constructor",
    "gnu/testlet/java/lang/IllegalStateException/TryCatch",
    "gnu/testlet/java/lang/IllegalThreadStateException/constructor",
    "gnu/testlet/java/lang/IllegalThreadStateException/TryCatch",
    "gnu/testlet/java/lang/IndexOutOfBoundsException/constructor",
    "gnu/testlet/java/lang/IndexOutOfBoundsException/TryCatch",
    "gnu/testlet/java/lang/InstantiationException/constructor",
    "gnu/testlet/java/lang/InstantiationException/TryCatch",
    "gnu/testlet/java/lang/Integer/IntegerTest",
    "gnu/testlet/java/lang/InterruptedException/constructor",
    "gnu/testlet/java/lang/InterruptedException/TryCatch",
    "gnu/testlet/java/lang/NegativeArraySizeException/constructor",
    "gnu/testlet/java/lang/NegativeArraySizeException/TryCatch",
    "gnu/testlet/java/lang/NoClassDefFoundError/constructor",
    "gnu/testlet/java/lang/NoClassDefFoundError/TryCatch",
    "gnu/testlet/java/lang/NullPointerException/constructor",
    "gnu/testlet/java/lang/NullPointerException/TryCatch",
    "gnu/testlet/java/lang/NumberFormatException/constructor",
    "gnu/testlet/java/lang/NumberFormatException/TryCatch",
    "gnu/testlet/java/lang/RuntimeException/constructor",
    "gnu/testlet/java/lang/RuntimeException/TryCatch",
    "gnu/testlet/java/lang/SecurityException/constructor",
    "gnu/testlet/java/lang/SecurityException/TryCatch",
    "gnu/testlet/java/lang/String/charAt",
    "gnu/testlet/java/lang/String/compareTo",
    "gnu/testlet/java/lang/String/equals",
    "gnu/testlet/java/lang/String/substring",
    "gnu/testlet/java/lang/String/surrogate",
    "gnu/testlet/java/lang/String/to",
    "gnu/testlet/java/lang/StringBuffer/plus",
    "gnu/testlet/java/lang/System/arraycopy",
    "gnu/testlet/java/lang/UnsupportedOperationException/constructor",
    "gnu/testlet/java/lang/UnsupportedOperationException/TryCatch",
    "gnu/testlet/vm/ArrayTest",
    "gnu/testlet/vm/ClassForNameInStaticInitializerTest",
    "gnu/testlet/vm/ClassTest",
    "gnu/testlet/vm/ClassTest2",
    "gnu/testlet/vm/ExceptionTest",
    "gnu/testlet/vm/GetBytesTest",
    "gnu/testlet/vm/NestedExceptionTest",
    "gnu/testlet/vm/ObjectsTest",
    "gnu/testlet/vm/RuntimeTest",
    "gnu/testlet/vm/SystemTest",
    "gnu/testlet/vm/TestInterfaceAbstractConcrete",
    "gnu/testlet/vm/ThrowableTest",
    "java/lang/TestArrayPrameter",
    "java/lang/TestExceptionLocation",
    "java/lang/TestNestedFinally",
    "java/lang/TestStaticInit",
    "test/org/jikesrvm/basic/core/bytecode/TestFinally",
    "test/org/jikesrvm/basic/core/bytecode/TestInstanceOf",
    "test/org/jikesrvm/basic/core/bytecode/TestThrownException",
    "test/org/jikesrvm/basic/core/classloading/TestClassLoading",
    "gnu/testlet/vm/TestJasminExample",
    "gnu/testlet/vm/TestTwoFieldsSameName",
    "gnu/testlet/java/lang/String/hash",
    "gnu/testlet/java/lang/String/new_String",
    "gnu/testlet/java/lang/String/startsWith",
    "java/lang/TestString",
    "gnu/testlet/java/lang/String/decode",
    "gnu/testlet/java/lang/String/getBytes",
    "gnu/testlet/java/lang/String/getBytes13",
    "gnu/testlet/java/lang/String/getBytes14",
    "gnu/testlet/java/lang/String/indexOf",
    "gnu/testlet/java/io/ByteArrayInputStream/SimpleRead",
    // "gnu/testlet/java/io/ByteArrayInputStream/ProtectedVars", I think this test case is wrong.
    "test/org/jikesrvm/basic/core/classloading/TestUTF8",
    "gnu/testlet/vm/DoubleTest",
    "gnu/testlet/java/io/PrintStreamTest",
    "gnu/testlet/java/lang/Math/max",
    "gnu/testlet/java/lang/Math/min",
    "gnu/testlet/java/lang/Math/cos",
    "gnu/testlet/java/lang/Math/sin",
    "gnu/testlet/java/util/Vector/copyInto",
    "gnu/testlet/java/lang/Thread/sleep",
    "gnu/testlet/java/lang/Thread/yield",
    "java/lang/TestThreads",
    "gnu/testlet/java/lang/Thread/priority",
    "gnu/testlet/java/lang/Thread/wait",
    "gnu/testlet/vm/TestIsolate",
    "javax/crypto/TestRC4",
    "org/json/me/TestJSON",
    "java/lang/TestThreadJoin",
    "gnu/testlet/java/lang/Object/constructor",
    "gnu/testlet/java/lang/String/StringTest",
    null
  };

  static String[] brokenList = {
//  "com/nokia/mid/impl/jms/core/TestLauncher",
//  "com/nokia/mid/s40/codec/TestDataEncodeDecode",
//  "com/nokia/mid/ui/frameanimator/TestFrameAnimator",
//  "com/nokia/mid/ui/TestDeviceControl",
//  "com/nokia/mid/ui/TestDirectGraphics",
//  "com/nokia/mid/ui/TestTextEditor",
//  "com/nokia/mid/ui/TestVirtualKeyboard",
//  "com/sun/midp/crypto/TestMD5",
//  "com/sun/midp/crypto/TestRSA",
//  "com/sun/midp/i18n/TestResourceConstants",
//  "com/sun/midp/io/j2me/http/TestHttpConnection",
//  "com/sun/midp/io/j2me/http/TestHttpHeaders",
//  "com/sun/midp/io/j2me/socket/StressTestSocket",
//  "com/sun/midp/io/j2me/socket/TestSocket",
//  "com/sun/midp/io/j2me/storage/TestRandomAccessStream",
//  "com/sun/midp/io/TestHttpUrl",
//  "com/sun/midp/io/TestUrl",
//  "com/sun/midp/publickeystore/TestInputOutputStorage",
//  "com/sun/midp/publickeystore/TestWebPublicKeyStore",
//  "com/sun/midp/rms/TestRecordStoreFileNatives",
//  "com/sun/midp/ssl/TestSSLStreamConnection",
//  "com/sun/midp/util/isolate/TestInterIsolateMutex",
//  "gnu/testlet/java/lang/Object/ObjectTest",
//  "gnu/testlet/java/lang/Object/wait",
//  "gnu/testlet/java/lang/System/getProperty",
//  "gnu/testlet/vm/FieldNotFoundException",
//  "gnu/testlet/vm/InterfaceTest",
//  "gnu/testlet/vm/MethodNotFoundException",
//  "gnu/testlet/vm/NativeTest",
//  "java/lang/TestStaticInitRaceCondition",
//  "java/lang/TestStringIntern",
//  "java/lang/TestSystem",
//  "java/lang/TestThread",
//  "java/lang/TestThreadPriority",
//  "javax/microedition/io/file/TestFileConnection",
//  "javax/microedition/io/file/TestFileSystemRegistry",
//  "javax/microedition/io/TestHttpsConnection",
//  "javax/microedition/lcdui/game/TestSprite",
//  "javax/microedition/lcdui/TestAlert",
//  "javax/microedition/lcdui/TestFont",
//  "javax/microedition/lcdui/TestGraphics",
//  "javax/microedition/lcdui/TestGraphicsClipping",
//  "javax/microedition/lcdui/TestKeyConverter",
//  "javax/microedition/lcdui/TestOne",
//  "javax/microedition/lcdui/TestStringItemNoLabelSizing",
//  "javax/microedition/lcdui/TestStringItemSizing",
//  "javax/microedition/lcdui/TestTextEditorFocus",
//  "javax/microedition/lcdui/TestTwo",
//  "javax/microedition/location/TestLocation",
//  "javax/microedition/media/control/TestVolumeControl",
//  "javax/microedition/media/TestAudioPlayer",
//  "javax/microedition/media/TestAudioRecorder",
//  "javax/microedition/media/TestMediaImage",
//  "javax/microedition/media/TestPlayerListener",
//  "javax/microedition/media/TestPlayTone",
//  "javax/microedition/media/TestVideoPlayer",
//  "javax/microedition/pim/TestPIM",
//  "javax/microedition/rms/TestRecordStore",
//  "javax/microedition/sensor/TestSensor",
//  "javax/wireless/messaging/SendSMSTest",
//  "org/mozilla/io/TestLocalMsgProtocol",
//  "org/mozilla/io/TestNokiaActiveStandbyServer",
//  "org/mozilla/io/TestNokiaContactsServer",
//  "org/mozilla/io/TestNokiaImageProcessingInMultiThread",
//  "org/mozilla/io/TestNokiaImageProcessingServer",
//  "org/mozilla/io/TestNokiaMessagingServer",
//  "org/mozilla/io/TestNokiaPhoneStatusServer",
//  "org/mozilla/io/TestNokiaProductInfoServer",
//  "org/mozilla/io/TestNokiaSASrvRegServer",
//  "test/org/jikesrvm/basic/core/bytecode/TestResolveOnCheckcast",
//  "test/org/jikesrvm/basic/core/bytecode/TestResolveOnInstanceof",
//  "test/org/jikesrvm/basic/core/bytecode/TestResolveOnInvokeInterface",
//  "com/sun/midp/events/TestEventQueue",
//  "com/sun/midp/events/TestNativeEventPool",
//  "gnu/testlet/java/lang/Thread/isAlive",
//  "gnu/testlet/java/lang/Thread/join",
//  "gnu/testlet/java/lang/Thread/name",
  null};

  static {
//  list = brokenList;
  }
};
