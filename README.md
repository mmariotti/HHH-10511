# HHH-10511
PluralAttribute.getPersistentAttributeType() wrong value with enhanced classes

uses:

1. test without bytecode enhancement (success): $ mvn clean test
2. test with bytecode enhancement (failure) $ mvn clean test -Penhanced
