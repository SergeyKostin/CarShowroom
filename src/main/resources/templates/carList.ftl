<html>
<head>
    <title>Audi</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container" style="margin-top: 30px">
    <div class="row">
        <div class="col-lg-2">
            <form action="/request" method="get">
                <input type="hidden" value="${model}" name="model">
                <input type="hidden" value="test drive" name="goal">
                <input type="submit" class="btn btn-primary" value="sign up for a test drive">
            </form>
        </div>
        <div class="col-lg-2">
            <form action="/request" method="get">
                <input type="hidden" value="${model}" name="model">
                <input type="hidden" value="discount" name="goal">
                <input type="submit" class="btn btn-primary" value="request a discount">
            </form>
        </div>
    </div>
</div>
<div class="container" style="margin-top: 30px">
    <div class="row">
        <div class="col-nd-12">
            <div class="panel panel-default">
                <div class="panel-heading">Audi</div>
                <div class="panel-body">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>Model:</th>
                            <th>Color:</th>
                            <th>Engine Power:</th>
                            <th>Volume:</th>
                            <th>Equipment:</th>
                            <th>Coast:</th>
                        </tr>
                        </thead>
                        <tbody>
    <#list carList as car>
    <tr>
        <td>${car.model}</td>
        <td>${car.color}</td>
        <td>${car.enginePower}</td>
        <td>${car.volume}</td>
        <td>${car.equipment}</td>
        <td>${car.coast}</td>
    </tr>
    </#list>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>