

<body>
<h1>Programming Project 2</h1>
<h3>Due Friday, March 3 at 11:59pm</h3>

<p><em><strong>IMPORTANT:</strong> Read the
<strong>Do's and Dont's</strong>
in the <strong>Course Honor Policy</strong> found on Canvas. </em>
</p>

<h3>I. Overview</h3>

<p>This second programming assignment is to give you practice writing loops and manipulating strings.  Arrays are not needed, and <em>and you should not
use arrays in your assignment</em>.</p>



<h3>II. Code Readability (20% of your project grade)</h3>

<p>As with the last project, you are required to have code that is easy for another person to read and understand.
To accomplish that, the class will have certain rules about how your code should look.</p>

<p><strong>To receive the full readability marks, your code must follow the following guideline:</strong>
<ul>
<li>You should place a comment at the top of the file that contains your name
and a short description of the purpose of the class.</li>
<li>You should place a <em>short</em> comment before (directly above) each method describing the method.  The comment should
be only describe <em>what</em> the method does, not <em>how</em> it does it.  Do not simply copy the descriptions
below for your comments.</li>
<li>You should place a short comment directly above each field (should you really have any?)
indicating the purpose of the variable.</li>
<li>You should place a short comment above or to the right of each local variable explaining the purpose of the variable.  <em>Variables that are only used as loop indexes do not need to have comments.</em></li>
<li>You should place a short comment above each loop explaining how the loop works.  Ideally, you should list the goal of the 
loop, any required precondition for the loop, and if you can, a good iteration subgoal for the loop.</li>
<li>Any other complicated code such as code the has lots of if statements or variables should contain <em>short</em> comments to help the reader.  The comments can either be above the code fragment or to the right, aligned in a column.</li>
<li>Remember to use good style: everything should be indented nicely, variables should have good names, there should be a blank line between each method.</li>
</ul></p>

<hr>

<h3>III. Program Testing Document (20% of your project grade)</h3>

<p>As with the previous project, you are required to submit a document demonstrating that you thoroughly tested your program.
In this case, it means documenting tests for each of the methods listed below.
If you are unable to complete a method above, you should still
describe tests that would test the method had it been completed.</p>

<p>Hints for testing loops.  Your tests need to, at the minimum cover the following cases:
<ol>
<li><strong>Test 0, test 1, test many:</strong>  This means you have to test cases where the parameters, if they are integers,
are 0, 1 or some value other than 1.  If the parameters are strings, you have to test strings of length 0, 1, and more than 1.
If the strings must contain certain data, you need to test cases where they contain 0, 1, and more than 1 of the desired data.</li>
<li><strong>Test first, last, and middle:</strong>  In cases where you have to search in or modify a string, you need to test
cases where the item to be found or modified is the first character of the string, the last character of the string, or somewhere
in the middle of the string.</li>
</ol></p>

<p><strong>What must go in the report:</strong> For each method below, your report should describe, in English, what &quot;<em>test 0, 1, many</em>&quot;
and &quot;<em>test first, middle, last</em>&quot; mean for each of the methods.  Then, you should list the specific tests that you will do, what the expected
output is, and then (if you completed the method) a cut-and-paste from DrJava showing the actual test. </p>

<p><strong>JUnit</strong>: you were introduced to JUnit in a recent lab.  JUnit will be required for future homeworks, and you are welcome
to use it with this homework.  If you choose to write JUnit tests for your code,
you do not need to include the actual tests in your report.  Your JUnit file should include comments with each test that link to the report and indicate what
you are testing. For example, if your report indicates that the method requires a test with a string of length 0, your JUnit class should have such a test and
a comment on the test noting that it is the test of a length 0 string that your report described.  Try to organize the JUnit class and report to make it easy for
a reader to jump back and forth between the report and the tests.</p>

<hr>


<h3>IV. Java Programming (60% of your grade)</h3>

<p><strong>Guidelines for the program</strong>:
<ul>
<li>All methods listed below must be **public** and **static**.</li>
<li>If your code is using a loop to modify or create a string, you need to use the **StringBuilder** class from the API.</li>
<li>Keep the loops simple but also efficient.  Remember that you want each loop to do only one "task" while also avoiding unnecessary traversals of the data or lots of unnecessary extra memory.</li>
<li>No additional methods are needed.  
However, you may write additional <em>private</em> helper methods, but you still need to have efficient and simple algorithms. Do not write helper methods that do a significant number of <em>unnecessary</em>
traversals of the data.</li>
<li><strong><em>Important</em></strong>: you must not use either **break** or **continue** in your code.  These two commands almost always are used to compensate for
a poorly designed loop.  Likewise, you must not write code that mimics what **break** does.  Instead, re-write your loop so that the loop logic does not need break-type behavior.</li>
<li>While it may be tempting to hunt through the API to find classes and methods that can shorten your code, you may not
do that.  The first reason is that this homework is an exercise in writing loops, not in using the API.  The second reason is that in a lot of cases, the API methods may shorten the <em>writing</em> of your code but increase its <em>running time</em>.
The only classes and methods you can use are listed below.  Note: if a method you want to use from the API is not listed, you should <em>not</em> implement the method yourself so you can use it.
Rather, you shoud look for the solution that does not need that method.</p>

<p>You <em>are allowed</em> to use the following from the Java API:
<ul><li>class String
    <ul><li>length</li>
        <li>charAt</li>
   </ul></li>
   <li>class StringBuilder
   <ul><li>length</li>
       <li>charAt</li>
       <li>append</li>
       <li>toString</li>
   </ul></li>
   <li>class Character
    <ul><li>any method</li>
   </ul></li>
</ul>
</p>
</ul>
</p>

<p>Create a class called **HW2** that contains the following methods:
<ol>
<li><p>**matchingParentheses** takes a **String** as input and returns a **boolean**:<br />
The method should return true if all the parentheses (if any) in the input are properly matched.  Any closing parenthesis **')'** should be preceded by
a matching open parenthesis **'('** and there should be exactly one open parenthesis for each closed parenthesis.
 <br />
**matchingParentheses("This is a (test (of the) (matching)) parentheses")** should return **true**<br />
**matchingParentheses("The (second closing) parenthesis) does not match")** should return **false**
</p></li>

<li><p>**everyNthExcept(String string, int start, int skip, int except)** returns a **String**<br />
Returns every **skip**th character of **string**, starting with the **start**-th character, except
do not include the character if it is one of the **except**-th characters from **start**.  For example:
**everyNthExcept(s, 2, 2, 4)** should include every 2nd character of **s**, starting with the second character
of **s**, but it does not include every 4th character after the second character of **s**.
You can assume **start**, **skip**, and **except** are all positive.<br />
**everyNthExcept("abcdefghijklmnop", 2, 2, 4)** should return **"bdhlp"**<br />
**everyNthExcept("abcdefghijklmnop", 3, 2, 4)** should return **"ceim"**
</p></li>

<li><p>**flipEachK** should take a **String** and an **int** as input and returns a **String**. <br />
Let <em>k</em> be the name of the input integer.  The output string should contain the first <em>k</em> characters of the
input string in order, the next <em>k</em> characters of the input string in reverse order, the next <em>k</em> characters
of the input string in normal order, and so on.  The output string should have all the characters of the input string and 
no others.<br />
**flipEachK("abcdefghijklmn", 4)** should return **"abcdhgfeijklnm"**
</p>
</li>

<li><p>**reverseDigits** should take a **String** as input and output a **String**.<br />
The output **String** should be identical to the input **String** except all digits (0 through 9) of
the input **String** are in reverse order (but same locations) in the output **String**.<br />
**reverseDigits("0 the d1gits of the2 string3 4 are8 reversed 9!")** should return **"9 the d8gits of the4 string3 2 are1 reversed 0!"**
</p></li>

<li><p>**editOut** should take a **String** as input and output a **String**.<br />
You may assume the input **String** has properly matched parentheses. <em>The behavior for improperly matched parentheses is up to you, but the method should not crash.</em>
The output **String** should be identical to the input **String** except that any text inside a pair of matched parentheses is removed, including the parentheses.
In addition, if there is a pair of matched parentheses inside the removed text, that text should be retained (though the parentheses should be removed).  If there are any matched parentheses
inside the retained text, that text should be removed, and so on.<br />
**editOut("this is an (unusual (example)) of (editing out and (retaining)) text")** should return **"this is an example of retaining text"**<br />
**editOut("this is (another) (example) showing (((((removal))))) -( and )- ((((retention))))")** should return **"this is&nbsp;&nbsp;&nbsp;showing&nbsp;&nbsp-- retention"**
</p>
</li>

<li><p>**replaceText** takes two **String**s as input and returns a **String**.<br />
Each input string will have text with zero or more substrings marked by matching parentheses.
The returned string should contain the contents of the first string, except that
each substring that is inside parentheses in the first input string is replaced by the
matching substring that is inside parentheses in the second input string.  (So the first substring of string 1
is replaced by the first substring of string 2, the second by the second, and so on.)  If the first input string has more
substrings in matching parentheses than the second string does, the substrings are simply removed.
If the second string has more substrings in matching parentheses, these are ignored.
Any nested and matched parentheses (matched parentheses inside the outer set of matched parentheses) should be treated as regular characters.<br />
**replaceText("a (simple) programming (example)", "(cool) (problem)")** should return **"a cool programming problem"**<br />
**replaceText("a ((nested) example) with (three) replacements (to (handle))", "the replacements are (answer) and (really (two) not three)")** should return **"an answer with really (two) not three replacements "**
<br />
As before, the behavior for unmatched parentheses is up to you, but your method should not crash.
</p></li>


<li><p><strong>Extra Credit:</strong> **reverseAll** should take a **String** and return a **String**<br />
All substrings inside matching parentheses should be reversed.  If the reversed portion contains matching parentheses, these should be "re-reversed" and so on.
The parentheses should still be correctly matched and nested about the different affected substrings.<br />
**reverseAll("a b (c d e (f g) (h (i j k l (m n o) (p q)) r s t)) (u v w) x y z")** should return **"a b ((h ((p q) (m n o) l k j i) r s t) (f g) e d c) (w v u) x y z"**
</p></li>


</ol></p>

<hr>

<h3>V. Submitting Your Project</h3>
<p>Submit the **.java** file (not the **.class** files or the **.java~** files) 
of your class plus the testing report on Canvas.</p>

</body>