
<body>
<h1>Programming Project 1</h1>
<h3>Due Friday, February 17 at 11:59pm</h3>


<p><em><strong>IMPORTANT:</strong> Read the 
<strong>Do's and Dont's</strong>
in the <strong>Course Honor Policy</strong>. </em>
</p>

<h3>I. Overview</h3>

<p>The theme of this assignment is to write code to process trades on a stock market.
The purpose is to give you practice writing classes, fields, methods, conditional statements, and
constructors.  You will also be introduced to polymorphism.</p>

<hr>

<h3>II. Code Readability (20% of your project grade)</h3>

<p>Once upon a time, getting a program to work was the only goal of programming.  That was
before computers took over the world.  Now, with highly complex software running much of our lives,
the industry has learned that computer code is a written document that must be able to communicate
to other humans what the code is doing.  If the program is too hard for a human to quickly understand,
the company does not want it.</p> 

<p>Most companies enforce readable code by having very strict rules about how the program should look.
This class will do the same, but will not be quite as strict so you can have some freedom for developing
your own style.</p>

<p><strong>To receive the full readability marks, your code must follow the following guideline:</strong>
<ul>
<li>All variables (fields, parameters, local variables) must be given appropriate and descriptive names.</li>
<li>All variable and method names must start with a lowercase letter.  All class names must start with an uppercase letter.</li>
<li>The class body should be organized so that all the fields are at the top of the file, the 
constructors are next, and then the rest of the methods.</li>
<li>Every statement of the program should be on it's own line and not sharing a line with another statement.</li>
<li>All code must be properly indented (see page 689 of the Lewis book for an example of good style).
    The amount of indentation is up to you, but it should be at least 2 spaces, and it must be used
    consistently throughout the code.</li>
<li>You must be consistent in your use of {, }.  The closing } must be on its own line and indented
the same amount as the line containing the opening {.</li>
<li>There must be an empty line between each method.</li>
<li>There must be a space separating each operator from its operands as well as a space after each comma.</li>
<li>There must be a comment at the top of the file that includes both your name and a description of what the class represents.</li>
<li>There must be a comment directly above each method that, in one or two lines, states <em>what</em>
task the method is doing, not how it is doing it.  Do not directly copy the homework instructions.</li>
<li>There must be a comment directly above each field that, in one line, states what the field is storing.</li>
<li>There must be a comment either above or to the right of each non-field variable indicating what the variable is storing.  Any comments placed to the right should be aligned so they start on the same column.</li>
</ul>
</p>

<hr>

<h3>III. Program Testing Document (20% of your project grade)</h3>

<p>Once upon a time, companies thought errors in code were only a minor inconvenience.
That was before software glitches started killing people and destroying companies.
Now, standard practice is that all code must be thoroughly verified before a company is willing to release it.
At a large number of firms, programmers are required to <em>first</em> design the test cases the 
program must pass and <em>then</em> start writing the code.  We will not be that strict in this 
class, but you will need to test your code.</p>

<p><strong>To receive full testing marks, you must write a testing report that shows that you thoroughly
tested every method of the program.</strong>  The report should be a short English description for each
test (what you are testing and what the expected result of the test is) followd by the 
actual result of the test.  If you are using DrJava, you can enter the test into the interactions pane
and then copy and paste the test code plus the result to your report.  If you fail to complete
the program, your report should indicate how you would go about testing the incomplete methods.</p>

<p><strong>Your grade on the testing report is how thoroughly you test your code, not how correctly
your code runs.</strong>  If your code is not 100% correct then your report <em>should</em> show
an incorrect result to some test.  Testing methods that do not have conditional statements should
be pretty straightforward, but you need to put thought into testing methods with conditional
statements so that each branch of the if-statement is tested.</p>

<p><em>Hint 1</em>: You can test multiple methods with one test.  For example, you can test 
each setter/getter method pair together or you can test constructors and getter methods together.</p>

<p><strong><em>Hint 2: Do not put off testing to the end!</em></strong>  Test each method after you complete it.
Many methods depend on other methods.  Delaying testing could mean cascading errors that cause your
whole project to collapse.  Since you need to test anyway, copy any tests you do while writing the project do into a document, and
you are most of the way to completing your report.</p>

<p>You are allowed (but not required) create a separate class that tests your program.  This can be a regular class or a JUnit class.
You must still write a testing report that documents the kinds of tests you need to thoroughly test your program, but you don't have to list the actual tests in the testing report if you are providing the separate testing class.  Do not
place testing code into a main method of the classes below.  That is not the purpose
of a main method.</p>

<hr>

<h3>IV. Java Programming (60% of your grade)</h3>

<p><strong>Guidelines for the program</strong>:
<ul>
<li>All the listed methods must be public.</li>
<li>You will need to create several instance fields to store data, and every field must be private.</li>
<li>All fields must be initialized to an appropriate value.  They can be initialized either as part
if the field declaration or in the constructor.  Even if you feel that the default value provided by Java
is appropriate, you still must give an explicit initialization.</li>
<li>Any method whose name begins with <tt>set</tt> should only assign a value to an appropriately
named field.  The method should do no other processing.  Any processing described in a <tt>set</tt>
method description below is for information only.  That actual processing will be done by other methods.
</li>
<li>Any method whose name begins with <tt>get</tt> should only return the appropriate value.
No other processing should occur in these methods.</li>
<li>Your class must include only the methods listed.  You may not write any other methods.</li>
<li>The behavior of your methods must match the descriptions below.</li>
<li>You should not write any loops in your program (though loops are allowed in the testing code).</li>
</ul>
</p>

<p><strong>The program:</strong> You will create the following eight classes.  The classes are listed in order of challenge from
more straightforward to more challenging.</p> 
<ol><li><p><tt>Trader</tt><br>
The <tt>Trader</tt> represents an entity that is allowed to trade stocks. 
The <tt>Trader</tt> class will need instance fields to keep track of the name of the trader and
a current balance for the trader.  The class will have the
following methods:
<ol type="a">
  <li><tt>getName</tt><br> Takes no input and returns a <tt>String</tt>.
      Returns the name of the trader.</li>
  <li><tt>setName</tt><br> Takes a single <tt>String</tt> as input and returns nothing.
      The name of the trader is changed to the input value.</li>
  <li><tt>getBalance</tt><br> Takes no input and returns a <tt>double</tt>.
      Returns the current balance of the trader.</li>
  <li><tt>withdraw</tt><br> Takes a single <tt>double</tt> value as input and returns nothing.
      The balance is decreased by the input amount.</li>
  <li><tt>deposit</tt><br> Takes a single <tt>double</tt> value as input and returns nothing.
      The balance is increased by the input amount.</li>
</ol></p>
<p>The <tt>Trader</tt> class will have one constructor:
<ul>
<li>The constructor takes a single <tt>String</tt> input
that is the trader name.</li>
</ul>
</p></li>

<li><p><tt>Order</tt><br>
An <tt>Order</tt> represents the data required to either buy or sell a stock.
The <tt>Order</tt> class should have instance fields to keep track of the stock symbol,
the number of shares, the price, the trader placing the order, and an indicator of whether we
can partially fill the order.  For the purposes of this homework, all stocks will have single 
character symbols.
The <tt>Order</tt> class will have the
following methods:
<ol type="a">
  <li><tt>getStockSymbol</tt><br> takes no input and returns a <tt>char</tt>.
    Returns the single character symbol of the stock that this order is for.  (The order's stock symbol does not change.)</tt>
  <li><tt>getNumberShares</tt><br> Takes no input and returns an <tt>int</tt>.
    Returns the number of shares of the order.</li>
  <li><tt>setNumberShares</tt><br> Takes a single <tt>int</tt> value as input and returns nothing.
    The input value is the number of shares of the order.</li>
  <li><tt>setPrice</tt><br> Takes a single <tt>double</tt> value and returns nothing.
    The input value is the price per share of the order.</li>
  <li><tt>getPrice</tt><br> Takes no input and returns a <tt>double</tt>.
    Returns the desired price per share of the order.</li>
  <li><tt>setAllOrNone</tt><br> Takes a single <tt>boolean</tt> as input returns nothing.
    Sets whether we must trade all the shares of the order (a <tt>true</tt> value) or whether we
    can trade some of the shares of the order (a <tt>false</tt> value).</li>
  <li><tt>isAllOrNone</tt><br> Takes no input and returns a <tt>boolean</tt>.
    A return value of <tt>true</tt> indicates that we must trade all the shares of the order.
    A return value of <tt>false</tt> indicates that we can trade some, but not all, of the shares of the order.</li>
  <li><tt>getTrader</tt><br> Takes no input and returns a <tt>Trader</tt> value.
    The method returns the trader that placed this order. (The trader of the order does not change.)</li>
</ol>
</p>
<p>The <tt>Order</tt> class has one constructor.
<ul>
  <li>the constructor takes five inputs: a <tt>char</tt> that is the stock symbol,
      an <tt>int</tt> that is the number of shares, a <tt>double</tt> that is the price, a
      <tt>boolean</tt> that is true if we must trade all the shares of the order,
      and a <tt>Trader</tt> that is the trader placing the order.</li>
</ul>
</p></li>

<li><p><tt>BuyOrder</tt><br>
A <tt>BuyOrder</tt> instance represents an order to buy stock.  The <tt>BuyOrder</tt> class should extend
the <tt>Order</tt> class.  The <tt>BuyOrder</tt> class has the same features as the <tt>Order</tt> class.
</p></li>

<li><p><tt>SellOrder</tt><br>
A <tt>SellOrder</tt> instance represents an order to sell stock.  The <tt>SellOrder</tt> class should extend
the <tt>Order</tt> class.  The <tt>SellOrder</tt> class has the same features as the <tt>Order</tt> class.
</p></li>

<li><p><tt>MarketBuyOrder</tt><br>
A <tt>MarketBuyOrder</tt> instance represents an order to buy stock that is placed by
a <em>market maker</em>.  The <tt>MarketBuyOrder</tt> class should extend
the <tt>BuyOrder</tt> class.  
The <tt>MarketBuyOrder</tt> class has the same features as the <tt>BuyOrder</tt> class except
for the following:
<ul><li>The constructor for <tt>MarketBuyOrder</tt> should set its input types so that the <tt>Trader</tt>
of the order must be a value of type <tt>Market</tt>.</li>
<li>The <tt>isAllOrNone</tt> method should never return <tt>true</tt>.</li>
</ul>
</p></li>

<li><p><tt>MarketSellOrder</tt><br>
A <tt>MarketSellOrder</tt> instance represents an order to sell stock that is placed by
a <em>market maker</em>.  The <tt>MarketSellOrder</tt> class should extend
the <tt>SellOrder</tt> class.  
The <tt>MarketSellOrder</tt> class has the same features as the <tt>SellOrder</tt> class except
for the following:
<ul><li>The constructor for <tt>MarketSellOrder</tt> should set its input types so that the <tt>Trader</tt>
of the order must be a value of type <tt>Market</tt>.</li>
<li>The <tt>isAllOrNone</tt> method should never return <tt>true</tt>.</li>
</ul>
</p></li>

<li><p><tt>Transaction</tt><br>
A <tt>Transaction</tt> represents the successful trade of stock.
The <tt>Transaction</tt> class should have instance fields to keep track of the stock symbol,
the number of shares, the price, the trader buying the stock, the trader selling the stock,
the market handling the transaction, and an indicator of whether the transaction has been closed.
Other than the indicator field, the fields of <tt>Transaction</tt> will not change value.
The <tt>Transaction</tt> class will have the
following methods:
<ol type="a">
  <li><tt>getStockSymbol</tt><br> Takes no input and returns a <tt>char</tt>.
    Returns the single character symbol of the stock that this trade transaction is for. </tt>
  <li><tt>getNumberShares</tt><br> Takes no input and returns an <tt>int</tt>.
    Returns the number of shares of this trade transaction.</li>
  <li><tt>getPrice</tt><br> Takes no input and returns a <tt>double</tt>.
    Returns the price per share this of this trade transaction.</li>
  <li><tt>getBuyer</tt><br> Takes no input and returns a <tt>Trader</tt> value.
    The method returns the trader that is buying the stock.</li>
  <li><tt>getSeller</tt><br> Takes no input and returns a <tt>Trader</tt> value.
    The method returns the trader that is selling the stock.</li>
  <li><tt>getMarketMaker</tt><br> Takes no input and returns a <tt>Market</tt> value.
    The method returns the market that is handling the transaction.</li>
  <li><tt>isClosed</tt><br> Takes no input and returns a <tt>boolean</tt> value.</li>
  <li><tt>processTransaction</tt> <br>Takes no input and returns no value.
  If the transaction is closed, this method does nothing.
  Otherwise, the method withdraws the transaction cost (the number of shares times the price)
  from the buyer and deposits it into the seller.  In addition, the market may change a
  <em>transactionFee</em> and/or a <em>commission</em> on the transaction.  The commission is 
  a percent that is multiplied by the transaction cost and the transaction fee is a fixed amount.
  The buyer and seller will each pay half of the commission and transaction fee amounts, and these
  funds are withdrawn from the buyer and seller and are deposited to the market.
  Finally, the transaction is closed.</li>
</ol>
</p>
<p>The <tt>Transaction</tt> class has one constructor.
<ul>
  <li>the constructor takes six inputs: a <tt>char</tt> that is the stock symbol,
      an <tt>int</tt> that is the number of shares, a <tt>double</tt> that is the price,
      a <tt>Trader</tt> that is the trader selling the stock, a <tt>Trader</tt> that is the trader
      buying the stock, and a <tt>Market</tt> that is the market handling the transaction.</li>
</ul>
</p></li>

<li><p><tt>Market</tt><br>
The <tt>Market</tt> class will be a simplified version of the market for a stock.
<p>In the real world, the market for a single stock is a list of open buy and sell orders with the highest price buy order and
the lowest price sell order at the top of the list.  If an order's buy price ever matches or exceeds
another order's sell price, a trade happens.  The trade takes the shares from the seller and gives them
to the buyer and every agent involved in the transaction earns a fee or a commission.
For the market to function, there must always be available
buy and sell orders.  So, the market is formed by special traders called <em>market makers</em>.  
A <em>market maker</em> is required to always have buy and sell orders open for the stock.
</p><p>
In this simplified version, we combine the <em>market</em> and the <em>market maker</em>
into a single class.  Instead of having a list of open orders, the market will have up to two open
buy and sell orders (plus the required market maker buy and sell orders) at any one time.</p>
<p>The <tt>Market</tt> class will extend the <tt>Trader</tt> class.
The <tt>Market</tt> class needs fields to
store the following information: the stock symbol for this market, the amount of fees and commissions
that are charged anytime there is a trade, the best and second best buy orders for a stock and the
best and second best sell orders for a stock, the current market maker buy order and market maker sell
orders for a stock.  Because a market maker order must always be present when the market is open, 
there will be functionality below to automatically keep market maker orders available.
To do this automatic adjustment of the market maker orders there will need to be fields
to indicate how many shares should be in the market maker order and how the price of the order should
change if the market maker order is ever sold or purchased.</p>
<p>Besides all the methods that <tt>Trader</tt> has, the <tt>Market</tt> class should have the
following additional methods:
<ol type="a">
  <li><tt>getStockSymbol</tt><br> takes no input and returns a <tt>char</tt>.
   Returns the stock symbol that this market is for.  The stock symbol will not change.</li>
  <li><tt>getCommission</tt><br>Takes no input and returns a <tt>double</tt> value.
   Returns the market's commission rate.</li>
  <li><tt>setCommission</tt><br>Takes a single input that is a <tt>double</tt> value and returns nothing.
   Changes the commission the market charges for any trades the market handles.</li>
  <li><tt>getTradeFee</tt><br>Takes no input and returns a <tt>double</tt> value.
   Returns the market's trade fee.</li>
  <li><tt>setTradeFee</tt><br>Takes a single input that is a <tt>double</tt> value and returns nothing.
   Changes the market's fee that is charged with each trade handled.</li>
  <li><tt>getMarketOrderSize</tt><br>Takes no input and returns an <tt>int</tt> value.
   Returns the number of shares that automaticaly generated market maker orders have.</li>
  <li><tt>setMarketOrderSize</tt><br>Takes a single input that is an <tt>int</tt> value and returns nothing.
   Changes the number of shares that any automatically generated market maker orders will have.</li>
  <li><tt>getPriceOffset</tt><br>Takes no input and returns a <tt>double</tt> value.
   Returns the market maker's order price offset.</li>
  <li><tt>setPriceOffset</tt><br>Takes a single input that is a <tt>double</tt> value and returns nothing.
   Changes the market maker's order price offset.</li>
  <li><tt>getBestBuyOrder</tt><br>Takes no input and returns a <tt>BuyOrder</tt>.
   Returns the market's best buy order.</li>
  <li><tt>getBestSellOrder</tt><br>Takes no input and returns a <tt>SellOrder</tt>.
   Returns the market's best sell order.</li>
  <li><tt>get2ndBestBuyOrder</tt><br>Takes no input and returns a <tt>BuyOrder</tt>.
   Returns the market's second best buy order.</li>
  <li><tt>get2ndBestSellOrder</tt><br>Takes no input and returns a <tt>SellOrder</tt>.
   Returns the market's second best sell order.</li>
  <li><tt>getMarketBuyOrder</tt><br>Takes no input and returns a <tt>MarketBuyOrder</tt>.
   Returns that market's market maker buy order.</li>
  <li><tt>setMarketBuyOrder</tt><br>Takes a single input that is a <tt>MarketBuyOrder</tt>.
   Changes the market's market maker buy order to the input order.</li>
  <li><tt>getMarketSellOrder</tt><br>Takes no input and returns a <tt>MarketSellOrder</tt>.
   Returns that market's market maker sell order.</li>
  <li><tt>setMarketSellOrder</tt><br>Takes a single input that is a <tt>MarketSellOrder</tt>.
   Changes the market's market maker sell order to the input order.</li>
  <li><tt>currentMarketBuyPrice</tt><br>Takes no input and returns a <tt>double</tt>.
   Returns the price of the market's best buy order.  If there is no best buy order, it returns the price of the  market's
   market maker buy order.</li>
  <li><tt>currentMarketSellPrice</tt><br>Takes no input and returns a <tt>double</tt>.
   Returns the price of the market's best sell order.  If there is no best sell order, it returns the price of the market's
   market maker sell order.</li>
  <li><tt>isOpen</tt><br>Takes no input and returns a <tt>boolean</tt>.
   Returns <tt>true</tt> if both a market maker buy order and a market maker sell order exist (is not <tt>null</tt>) and the
   price of the market maker buy order is less than the price of the market maker sell order.
   Returns <tt>false</tt> otherwise.</li>
  <li><tt>isValidOrder</tt><br>Takes a single input that is a <tt>Order</tt> value and returns
   a <tt>boolean</tt>.
   If the order's stock symbol matches the market's stock symbol, the price of the order is greater than
   or equal to the price of the market's market maker buy order, and the price of the order is less than or equal
   to the price of the market's market maker sell order, then the method returns <tt>true</tt>.
   Otherwise the method returns <tt>false</tt>.</li>
  <li><tt>matchingOrders</tt><br>Takes a <tt>BuyOrder</tt> and a <tt>SellOrder</tt> as input and
   returns a <tt>boolean</tt>.  The method should return <tt>true</tt> if the 
           buy order's price is greater than or equal to the sell order's price, and
           if either order is <em>all or none</em>, the the other order must have a number of shares
           that is equal to or larger than the <em>all or none</em> order's number of shares.</li>
  <li><tt>addOrderToMarket</tt><br> Takes a single <tt>BuyOrder</tt> and returns nothing.
          If the buy order's stock symbol does not match the market's stock symbol, the
          method makes no changes to the market.
          Otherwise, the method should compare the price of the order against the best buy
             order (if it exists).  If the best buy order does not exist or if the price of the order
             is greater than the price of the best
             buy order, the best buy order is moved to the second best buy order, and this order becomes
             the best buy order.  If the price of the order is less than or equal to the price of the
             best buy order and either the second best buy order does not exist or the price of the order
             is greater than the price of the second best buy order, then this order
             becomes the second best buy order.  Otherwise there are no changes to the market.</li>
  <li><tt>addOrderToMarket</tt> <br>Takes a single <tt>SellOrder</tt> and returns nothing.
          If the sell order's stock symbol does not match the market's stock symbol, the
          method makes no changes to the market.
          Otherwise, the method should compare the price of the order against the best sell
             order (if it exists).  If the best sell order does not exist or if the price of the order is less than the price of the best
             sell order, the best sell order is moved to the second best sell order, and this order becomes
             the best sell order.  If the price of the order is greater than or equal to the price of the
             best sell order and either the second best buy order does not exists or this order's price is less than the price of the second best sell order, then this order
             becomes the second best sell order.  Otherwise there are no changes to the market.</li>

  <li><tt>placeOrder</tt><br>Takes a single input that is a <tt>BuyOrder</tt> and returns a 
   <tt>Transaction</tt> value.  The method should do the following:
    <ol><li>If the market is not open or if the buy order is not a valid order (use the <tt>isOpen</tt> and <tt>isValidOrder</tt> methods), the method should do nothing but return <tt>null</tt>.</li>
        <li>Next, the method should use the <tt>matchingOrders</tt> method to compare the 
            buy order against the market's best sell order, the market's
            second best sell order, and the market's market maker sell order, in that order.
            If there is no <em>match</em> between the buy order and any of the three sell order's
	    the method should call <tt>addOrderToMarket</tt> with the buy order and return <tt>null</tt>.</li>
         <li>Otherwise, the method should create a trade using the buy order and the
             first sell order for which <tt>matchingOrders</tt> returned <tt>true</tt>.
             Creating a trade involves creating a new <tt>Transaction</tt> value
           that stores the data of the trade and then doing book keeping to maintain the market.
           The <tt>Transaction</tt> value created is returned by the method.</p>
           <p>The new <tt>Transaction</tt> should have the stock symbol, buyer, seller, and market
           set according to this market, the buy order and the matching sell order.
           The price of the <tt>Transaction</tt> is the price of the <em>sell order</em>, and the
           number of shares of the <tt>Transaction</tt> is the lesser of the number of shares of
           the two orders.</p>
           <p>If the matching sell order is the market's market maker sell order, then the market maker sell order is adjusted
            with its number of shares set to the <em>market maker order size</em> and the price of the
            market maker sell order <em>increased</em> by the market maker <em>price offset</em>.</p>
           <p>If the matching sell order is the second best sell order, the second best sell order is removed
              (set to <tt>null</tt>).</p>
           <p>If the matching sell order is the best sell order, the second best sell order is moved to the
              best sell order, and the second best sell order's value is set to <tt>null</tt>.</p></li>
           </ol></li>
  <li><tt>placeOrder</tt><br>Takes a single input that is a <tt>SellOrder</tt> and returns a 
   <tt>Transaction</tt> value.  The method should do the following:
    <ol><li>If the market is not open or if the sell order is not a valid order (use the <tt>isOpen</tt>
and <tt>isValidOrder</tt> methods), the method should do nothing but return <tt>null</tt>.</li>
        <li>Next, the method should use the <tt>matchingOrders</tt> method to compare the 
            sell order against the market's best buy order, the market's
            second best buy order, and the market's market maker buy order, in that order.
            If there is no <em>match</em> between the sell order and any of the three buy order's
	    the method should call <tt>addOrderToMarket</tt> with the sell order and return <tt>null</tt>.</li>
         <li>Otherwise, the method should create a trade using the sell order and the
             first buy order for which <tt>matchingOrders</tt> returned <tt>true</tt>.
             Creating a trade involves creating a new <tt>Transaction</tt> value
           that stores the data of the trade and then doing book keeping to maintain the market.
           The <tt>Transaction</tt> value created is returned by the method.</p>
           <p>The new <tt>Transaction</tt> should have the stock symbol, buyer, seller, and market
           set according to this market, the sell order and the matching buy order.
           The price of the <tt>Transaction</tt> is the price of the <em>buy order</em>, and the
           number of shares of the <tt>Transaction</tt> is the lesser of the number of shares of
           the two orders.</p>
           <p>If the matching buy order is the market's market maker buy order, then the market maker buy order is adjusted
            with its number of shares set to the <em>market maker order size</em> and the price of the
            market maker sell order <em>decreased</em> by the market maker <em>price offset</em>.</p>
           <p>If the matching buy order is the second best buy order, the second best buy order is removed
              (set to <tt>null</tt>).</p>
           <p>If the matching buy order is the best buy order, the second best buy order is moved to the
              best buy order, and the second best buy order's value is set to <tt>null</tt>.</p></li>
           </ol></li>
</ol>
</p>
<p>The <tt>Market</tt> class has one constructor.
<ul>
  <li>the constructor takes six inputs: 
a <tt>String</tt> value
representing the name of the market, a <tt>char</tt> that is the stock symbol for the market,
a <tt>double</tt> that is the trade fee, a <tt>double</tt> that is the commission,
an <tt>int</tt> that is the market maker order size, and a <tt>double</tt> that is the market
maker price offset.</p></li>
</ul>
</p></li>
</ol>

<hr>

<h3>V. Submitting Your Project</h3>
<p>Submit the <tt>.java</tt> files (not the <tt>.class</tt> files or the <tt>.java~</tt> files) for each
of your eight classes plus the testing report to Canvas.</p>

</body>
