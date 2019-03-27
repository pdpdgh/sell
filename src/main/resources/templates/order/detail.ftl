<html lang="zh-cmn-Hans">
<#include "../common/header.ftl">
<body>

<div class="container-fluid">
    <div class="row">
        <!--	侧边栏	 -->
        <#include "../common/nav.ftl">
        <!--	主要内容	-->
        <main role="main" class="col-10 ml-auto">
            <div class="row p-4">
                <table class="table table-light table-striped table-bordered table-hover col-5">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">订单id</th>
                        <th scope="col">订单总金额</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${orderDTO.orderId}</td>
                        <td>${orderDTO.orderAmount}</td>
                    </tr>
                    </tbody>
                </table>
                <table class="table table-light table-striped table-bordered table-hover mt-4">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">商品id</th>
                        <th scope="col">商品名称</th>
                        <th scope="col">价格</th>
                        <th scope="col">数量</th>
                        <th scope="col">金额</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list orderDTO.orderDetailList as orderDetail>
                    <tr>
                        <td>${orderDetail.productId}</td>
                        <td>${orderDetail.productName}</td>
                        <td>${orderDetail.productPrice}</td>
                        <td>${orderDetail.productQuantity}</td>
                        <td>${orderDetail.productQuantity * orderDetail.productPrice}</td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
                <div class="ml-auto pt-4" role="group">
                    <#if orderDTO.getOrderStatusEnum().message == "新订单">
                    <a class="btn btn-primary mr-4" role="button" href="/sell/seller/order/finish?orderId=${orderDTO.orderId}">完结订单</a>
                    <a class="btn btn-danger" role="button" href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}">取消订单</a>
                    </#if>
                </div>
            </div>
        </main>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script>

</script>

</body>
</html>
