
public class RelationalLogicalOperators {

public static void main(String[] args) {
Random rand = new Random();
int i = rand.nextInt(100);
int j = rand.nextInt(100);
System.out.println(&quot;i = &quot; + i);
System.out.println(&quot;j = &quot; + j);
System.out.println(&quot;i &gt; j is &quot; + (i &gt; j));
System.out.println(&quot;i &lt; j is &quot; + (i &lt; j));
System.out.println(&quot;i &gt;= j is &quot; + (i &gt;= j));
System.out.println(&quot;i &lt;= j is &quot; + (i &lt;= j));
System.out.println(&quot;i == j is &quot; + (i == j));
System.out.println(&quot;i != j is &quot; + (i != j));
System.out.println(&quot;(i &lt; 10) &amp;&amp; (j &lt; 10) is &quot; + ((i &lt; 10) &amp;&amp;
(j &lt; 10)));
System.out.println(&quot;(i &lt; 10) || (j &lt; 10) is &quot; + ((i &lt; 10) ||
(j &lt; 10)));
}
}