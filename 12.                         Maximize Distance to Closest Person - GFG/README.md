# 12. 
                        Maximize Distance to Closest Person
##  Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">You are given an array representing a row of seats&nbsp;where A[i] = 1&nbsp;represents a person sitting in the i<sup>th</sup>&nbsp;seat, and A[i] = 0&nbsp;represents that the i<sup>th</sup>&nbsp;seat is empty (0-indexed)</span></p>

<p><span style="font-size:18px">There is at least one empty seat, and at least one person sitting.</span></p>

<p><span style="font-size:18px">John wants to sit in the seat such that the distance between him and the closest person to him is maximized.&nbsp;</span></p>

<p><span style="font-size:18px">Return&nbsp;that maximum distance to the closest person.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
<strong>N = 7</strong>
<strong>A[] = </strong>{1, 0, 0, 0, 1, 0, 1}<strong> </strong>
<strong>Output: </strong>2
<strong>Explanation:</strong>
If John sits in the second open seat 
(i.e. A[2]), then the closest person 
has distance 2.If John sits in any other 
open seat, the closest person has distance 1.
Thus, the maximum distance to the closest 
person is 2.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
<strong>N = 2</strong>
<strong>A[] </strong><strong>= </strong>{0, 1}
<strong>Output: </strong>1
<strong>Explanation:</strong>
John can only sit at A[0].</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>maxDistance()</strong> which takes a Integer N and a list A of size N as input and returns maximum distance to the closest person..</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
2 &lt;= N &lt;= 10<sup>6</sup><br>
0 &lt;= A[i] &lt;= 1</span></p>
 <p></p>
            </div>