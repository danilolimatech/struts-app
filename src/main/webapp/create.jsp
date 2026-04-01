<%@ taglib prefix="s" uri="/struts-tags" %>

    <!DOCTYPE html>
    <html>

    <head>
        <title>Criar Encomenda</title>
    </head>

    <body>

        <h2>Criar Encomenda</h2>

        <s:form action="order-create" method="post">

            <s:textfield name="order.recipientName" label="Recipient Name" />

            <br />

            <s:textfield name="order.address" label="Address" />

            <br />

            <s:textfield name="order.description" label="Description" />

            <br />

            <s:submit value="Salvar" />

        </s:form>

    </body>

    </html>