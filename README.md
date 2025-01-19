# Java ArithmeticException: Division by Zero

This repository demonstrates a common Java error: an `ArithmeticException` caused by division by zero. The `BuggyDivision.java` file contains the buggy code, while `FixedDivision.java` shows the corrected version.

**Bug:**
The `BuggyDivision.java` file attempts to divide an integer by zero, resulting in an `ArithmeticException`.  This is a runtime exception, meaning it won't be caught during compilation.

**Solution:**
The `FixedDivision.java` file adds a check to prevent division by zero.  Before performing the division, the code verifies that the divisor is not zero.  If it is, an appropriate error message is displayed.  Alternatively, a default value can be used to avoid the error.