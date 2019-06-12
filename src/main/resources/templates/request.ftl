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
                <div class="panel-heading">Request a ${goal} by Aydi ${model}</div>
                <div class="panel-body">
                    <form action="/request" method="post">
                        <div class="form-group">
                            <label>You name:</label>
                            <input type="text" class="form-control" name="clientName">
                        </div>
                        <div class="form-group">
                            <label>You surname:</label>
                            <input type="text" class="form-control" name="clientSurname">
                        </div>
                        <div class="form-group">
                            <label>You patronymic</label>
                            <input type="text" class="form-control" name="clientPatronymic">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">You email:</label>
                            <input type="text" class="form-control" name="email" placeholder="name@example.com">
                            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                        </div>
                        <div class="form-group">
                            <label>You telephone:</label>
                            <input type="text" class="form-control" name="telephone">
                        </div>
                        <div class="form-group">
                            <label>Date and time:</label>
                            <input type="datetime-local" class="form-control" name="dateTime">
                        </div>

                        <input type="hidden" name="goal" value="${goal}">
                        <input type="hidden" name="model" value="${model}">
                        <input type="submit" class="btn btn-primary" name="request" value="request">
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>