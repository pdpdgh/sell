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
                <table class="table table-light table-striped table-bordered table-hover">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">订单id</th>
                        <th scope="col">姓名</th>
                        <th scope="col">手机号</th>
                        <th scope="col">地址</th>
                        <th scope="col">金额</th>
                        <th scope="col">订单状态</th>
                        <th scope="col">支付状态</th>
                        <th scope="col">创建时间</th>
                        <th colspan="2">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list orderDTOPage.content as orderDTO>
                    <tr>
                        <td>${orderDTO.orderId}</td>
                        <td>${orderDTO.buyerName}</td>
                        <td>${orderDTO.buyerPhone}</td>
                        <td>${orderDTO.buyerAddress}</td>
                        <td>${orderDTO.orderAmount}</td>
                        <td>${orderDTO.getOrderStatusEnum().getMessage()}</td>
                        <td>${orderDTO.getPayStatusEnum().getMessage()}</td>
                        <td>${orderDTO.createTime}</td>
                        <td><a href="/sell/seller/order/detail?orderId=${orderDTO.orderId}">详情</a></td>
                        <td>
                            <#if orderDTO.getOrderStatusEnum().message == "新订单">
                                <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}">取消</a>
                            </#if>
                        </td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
                <nav class="ml-auto" aria-label="Page navigation example">
                    <ul class="pagination pt-4">
                        <#if currentPage lte 1>
                            <li class="page-item disabled"><a class="page-link" href="#">上一页</a></li>
                        <#else>
                            <li class="page-item"><a class="page-link" href="/sell/seller/order/list?page=${currentPage - 1}&size=${size}">上一页</a></li>
                        </#if>

                        <#list 1..orderDTOPage.getTotalPages() as index>
                            <#if currentPage == index>
                                <li class="page-item disabled"><a class="page-link" href="#">${index}</a></li>
                            <#else>
                                <li class="page-item"><a class="page-link" href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a></li>
                            </#if>
                        </#list>

                        <#if currentPage gte orderDTOPage.getTotalPages()>
                            <li class="page-item disabled"><a class="page-link" href="#">下一页</a></li>
                        <#else>
                            <li class="page-item"><a class="page-link" href="/sell/seller/order/list?page=${currentPage + 1}&size=${size}">下一页</a></li>
                        </#if>
                    </ul>
                </nav>
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
