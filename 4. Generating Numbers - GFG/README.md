# 4. Generating Numbers
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an equation in the form <strong>2<sup>i</sup> * 3<sup>j</sup> * 5<sup>k</sup> * 7<sup>l</sup></strong>&nbsp;, where <strong>i, j, k, l <u>&gt;</u>&nbsp;0</strong>&nbsp;and are integers. Generate first <strong>N</strong> numbers from that equation in sorted order efficiently.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 15
<strong>Output:</strong>
1 2 3 4 5 6 7 8 9 10 12 14 15 16 18
<strong>Explanation:</strong>
These are the first 15 numbers.
Here 1 is for i=0, j=0, k=0, l=0
       i.e (2<sup>0 </sup>* 3<sup>0 </sup>* 5<sup>0</sup> * 7<sup>0</sup> = 1),
2 is for i=1, j=0, k=0, l=0
  i.e (2<sup>1</sup><sup> </sup>* 3<sup>0 </sup>* 5<sup>0</sup> * 7<sup>0</sup> = 2),
3 is for i=0, j=1, k=0, l=0
  i.e (2<sup>0</sup><sup> </sup>* 3<sup>1</sup><sup> </sup>* 5<sup>0</sup> * 7<sup>0</sup> = 3),
4 is for i=2, j=0, k=0, l=0
  i.e (2<sup>2</sup><sup> </sup>* 3<sup>0 </sup>* 5<sup>0</sup> * 7<sup>0</sup> = 4),
5 is for i=0, j=0, k=1, l=0
  i.e (2<sup>0</sup><sup> </sup>* 3<sup>0 </sup>* 5<sup>1</sup> * 7<sup>0</sup> = 5),
6 is for i=1, j=1, k=0, l=0
  i.e (2<sup>1</sup><sup> </sup>* 3<sup>1</sup><sup> </sup>* 5<sup>0</sup> * 7<sup>0</sup> = 6),
7 is for i=0, j=0, k=0, l=1
  i.e (2<sup>0</sup><sup> </sup>* 3<sup>0 </sup>* 5<sup>0</sup> * 7<sup>1</sup></span><span style="font-size:18px"> = 7),
8 is for i=3, j=0, k=0, l=0
  i.e (2<sup>3</sup></span><sup style="font-size:18px"> </sup><span style="font-size:18px">* 3</span><sup style="font-size:18px">0 </sup><span style="font-size:18px">* 5</span><sup style="font-size:18px">0</sup><span style="font-size:18px"> * 7</span><sup style="font-size:18px">0</sup><span style="font-size:18px"> = 8),
9 is for i=0, j=2, k=0, l=0 
  i.e (2<sup>0</sup></span><sup style="font-size:18px"> </sup><span style="font-size:18px">* 3<sup>2</sup></span><sup style="font-size:18px"> </sup><span style="font-size:18px">* 5</span><sup style="font-size:18px">0</sup><span style="font-size:18px"> * 7</span><sup style="font-size:18px">0</sup><span style="font-size:18px"> = 9) and so on.</span>
<span style="font-size:18px">Here, 11 is not included in the sequence 
as any </span><span style="font-size:18px">combination of 2<sup>i</sup> * 3<sup>j</sup> * 5<sup>k</sup> * 7<sup>l</sup> 
cannot sum up to 11.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
N = 1
<strong>Output:</strong>
1
<strong>Explanation: </strong>
These is the first number of the required
sequence.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function <strong>generateNumbers()&nbsp;</strong>which takes one integers&nbsp;<strong>N</strong>&nbsp;as the only input parameters, and returns an array&nbsp;containing first <strong>N</strong> element of the required sequnce.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*log(N))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N&nbsp;≤ 5*10<sup>4</sup></span></p>
 <p></p>
            </div>