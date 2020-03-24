#

NOTE: See the branch 'workaround' for a workaround from bug https://youtrack.jetbrains.com/issue/KT-35966

Example of the failure

gradle build

Will fail in compileKotlinMetadata:

```
> Task :compileKotlinMetadata FAILED
e: /Users/stewari/src/multi/src/commonMain/kotlin/myClass.kt: (2, 2): Unresolved reference: JsExport
```
