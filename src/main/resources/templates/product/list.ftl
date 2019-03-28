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
                        <th scope="col">商品id</th>
                        <th scope="col">名称</th>
                        <th scope="col">图片</th>
                        <th scope="col">单价</th>
                        <th scope="col">库存</th>
                        <th scope="col">描述</th>
                        <th scope="col">类目</th>
                        <th scope="col">创建时间</th>
                        <th scope="col">更新时间</th>
                        <th colspan="2">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list productInfoPage.content as productInfo>
                    <tr>
                        <td>${productInfo.productId}</td>
                        <td>${productInfo.productName}</td>
                        <td><img height="100" width="100" src="${productInfo.productIcon}" alt=""></td>
                        <td>${productInfo.productPrice}</td>
                        <td>${productInfo.productStock}</td>
                        <td>${productInfo.productDescription}</td>
                        <td>${productInfo.categoryType}</td>
                        <td>${productInfo.createTime}</td>
                        <td>${productInfo.updateTime}</td>
                        <td><a href="/sell/seller/product/index?productId=${productInfo.productId}">修改</a></td>
                        <td>
                            <#if productInfo.getProductStatusEnum().message == "上架">
                                <a href="/sell/seller/product/off_sale?productId=${productInfo.productId}">下架</a>
                            <#else>
                                <a href="/sell/seller/product/on_sale?productId=${productInfo.productId}">上架</a>
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
                            <li class="page-item"><a class="page-link" href="/sell/seller/product/list?page=${currentPage - 1}&size=${size}">上一页</a></li>
                        </#if>

                        <#list 1..productInfoPage.getTotalPages() as index>
                            <#if currentPage == index>
                                <li class="page-item disabled"><a class="page-link" href="#">${index}</a></li>
                            <#else>
                                <li class="page-item"><a class="page-link" href="/sell/seller/product/list?page=${index}&size=${size}">${index}</a></li>
                            </#if>
                        </#list>

                        <#if currentPage gte productInfoPage.getTotalPages()>
                            <li class="page-item disabled"><a class="page-link" href="#">下一页</a></li>
                        <#else>
                            <li class="page-item"><a class="page-link" href="/sell/seller/product/list?page=${currentPage + 1}&size=${size}">下一页</a></li>
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
