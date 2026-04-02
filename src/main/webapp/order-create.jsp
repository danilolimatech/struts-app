<%@ taglib prefix="s" uri="/struts-tags" %>

    <!DOCTYPE html>
    <html>

    <head>
        <title>Create Order</title>

        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>

        <div class="container mt-5">

            <div class="card shadow">
                <div class="card-header bg-primary text-white">
                    <h3 class="mb-0">Create Order</h3>
                </div>

                <div class="card-body">


                    <s:form action="order-create" method="post" theme="simple">

                        <s:if test="hasFieldErrors()">
                            <div class="alert alert-danger">
                                <s:fielderror />
                            </div>
                        </s:if>

                        <div class="mb-3">
                            <label class="form-label">Recipient Name</label>
                            <s:textfield name="order.recipientName" cssClass="form-control" required="true" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Address</label>
                            <s:textfield name="order.address" cssClass="form-control" required="true" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Description</label>
                            <s:textfield name="order.description" cssClass="form-control" />
                        </div>

                        <div class="d-flex justify-content-end gap-2">
                            <a href="order-list.action" class="btn btn-secondary">Voltar</a>
                            <s:submit value="Salvar" cssClass="btn btn-success" />
                        </div>

                    </s:form>

                </div>
            </div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    </body>

    </html>