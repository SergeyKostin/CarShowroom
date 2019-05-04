<html>
<head>
    <title>Audi</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
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
                        </tr>
                        </thead>
                        <tbody>
    <#list modelList as model>
    <tr>
        <td>
            <a href="/getCount?model=${model}">${model}</a>
        </td>
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