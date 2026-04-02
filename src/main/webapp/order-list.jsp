<%@ taglib prefix="s" uri="/struts-tags" %>

    <!DOCTYPE html>
    <html>

    <head>
        <title>Lista de Encomendas</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>

        <div class="container mt-4">

            <h1 class="mb-4">Orders</h1>

            <a href="order-form.action" class="btn btn-primary mb-3">Create a new order</a>

            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Recipient</th>
                        <th>Address</th>
                        <th>Description</th>
                        <th>Status</th>
                    </tr>
                </thead>

                <tbody>
                    <s:iterator value="orders" status="st">
                        <tr>
                            <td>
                                <s:property value="id" />
                            </td>
                            <td>
                                <s:property value="recipientName" />
                            </td>
                            <td>
                                <s:property value="address" />
                            </td>
                            <td>
                                <s:property value="description" />
                            </td>
                            <td>
                                <s:property value="status" />
                            </td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>

            <div class="mt-3 text-center">
                <strong>Total:</strong>
                <s:property value="orders.size()" />
            </div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    </body>

    </html>