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

<#--弹窗-->
<div class="modal" id="modal-websocket" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">提醒</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">&times;</span> </button>
            </div>
            <div class="modal-body">
                <p>你有新的订单！</p>
            </div>
            <div class="modal-footer">
                <button type="button" onclick="javascript:document.getElementById('notice').pause()" class="btn btn-primary" data-dismiss="modal">关闭</button>
                <button type="button" onclick="location.reload()" class="btn btn-primary" data-dismiss="modal">查看新的订单</button>
            </div>
        </div>
    </div>
</div>

<#--播放音乐-->
<audio id="notice" loop="loop">
    <source src="/sell/mp3/song.mp3" type="audio/mpeg"/>
</audio>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script>
    var websocket = null;
    if ('WebSocket' in window) {
        websocket = new WebSocket('ws://pdpnat.natapp1.cc/sell/webSocket');
    } else {
        alert('该浏览器不支持websocket! ');
    }
    websocket.onopen = function (event) {
        console.log('建立连接');
    }
    websocket.onclose = function (event) {
        console.log('连接关闭');
    }
    websocket.onmessage = function (event) {
        console.log('收到消息：' + event.data);
        // 弹窗提醒，播放音乐
        $('#modal-websocket').modal('show');
        document.getElementById('notice').play();
    }
    websocket.onerror = function (event) {
        alert('websocket通信发生错误！');
    }
    window.onbeforeunload = function (event) {
        websocket.close();
    }
</script>

</body>
</html>
