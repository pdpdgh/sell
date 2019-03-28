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
                <form class="col" role="form" method="post" action="/sell/seller/product/save">
                    <div class="form-group">
                        <label>名称</label>
                        <input name="productName" type="text" class="form-control" placeholder="input name" value="${(productInfo.productName)!''}"/>
                    </div>
                    <div class="form-group">
                        <label>价格</label>
                        <input name="productPrice" type="text" class="form-control" placeholder="input price" value="${(productInfo.productPrice)!''}"/>
                    </div>
                    <div class="form-group">
                        <label>库存</label>
                        <input name="productStock" type="number" class="form-control" placeholder="input stock" value="${(productInfo.productStock)!''}"/>
                    </div>
                    <div class="form-group">
                        <label>描述</label>
                        <input name="productDescription" type="text" class="form-control" placeholder="input description" value="${(productInfo.productDescription)!''}"/>
                    </div>
                    <div class="form-group">
                        <label>图片</label>
                        <img height="100" width="100" src="${(productInfo.productIcon)!''}" alt="">
                        <input name="productIcon" type="text" class="form-control mt-2" placeholder="input image source" value="${(productInfo.productIcon)!''}"/>
                    </div>
                    <div class="form-group">
                        <label>类目</label>
                        <select name="categoryType" class="form-control">
                            <#list categoryList as category>
                            <option value="${category.categoryType}"
                                <#if (productInfo.categoryType)?? && productInfo.categoryType == category.categoryType>
                                    selected
                                </#if>
                            >
                                ${category.categoryName}
                            </option>
                            </#list>
                        </select>
                    </div>
                    <input hidden name="productId" type="text" value="${(productInfo.productId)!''}"/>
                    <button type="submit" class="btn btn-primary">提交</button>
                </form>
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
    <#---->
</script>

</body>
</html>
