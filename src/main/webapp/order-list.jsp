<%@ taglib prefix="s" uri="/struts-tags" %>

    <!DOCTYPE html>
    <html>

    <head>
        <title>Lista de Encomendas</title>
    </head>

    <body>

        <h1>Orders</h1>

        <table>
            <tr>
                <th>ID</th>
                <th>Recipient</th>
                <th>Address</th>
                <th>Description</th>
                <th>Status</th>
            </tr>

            <s:iterator value="orders">
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
        </table>

        <br />

        <a href="order-form">Criar nova encomenda</a>

    </body>

    </html>