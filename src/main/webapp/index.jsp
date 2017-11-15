<html>
<head>
    <title>Simple Calculator</title>
    <link href="SimpleCalculator.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action='SimpleCalculatorServlet' method='get'>
    <input class='number' type='text' name='num1' value='4'>&nbsp;+&nbsp;
    <input class='number' type='text' name='num2' value='6'>&nbsp;=&nbsp;
    <input class='number' type='text' disabled>

    <br>
    <input class='number' type='text' name='num3' value='3'>&nbsp;*&nbsp;
    <input class='number' type='text' name='num4' value='5'>&nbsp;=&nbsp;
    <input class='number' type='text' disabled>
    <br>
    <input id='submit' type='submit'>
</form>
</body>
</html>
