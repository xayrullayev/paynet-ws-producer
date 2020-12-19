package uz.simplex.ws.endpoints;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import uws.provider.com.PerformTransactionArguments;
import uws.provider.com.PerformTransactionResult;

@Endpoint
public class PaymentEndpoint {
    private static final String NAMESPACE_URI = "http://uws.provider.com/";

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getArticleByIdRequest")
//    @ResponsePayload
//    public GetArticleByIdResponse getArticle(@RequestPayload GetArticleByIdRequest request) {
//        GetArticleByIdResponse response = new GetArticleByIdResponse();
//        ArticleInfo articleInfo = new ArticleInfo();
//        BeanUtils.copyProperties(articleService.getArticleById(request.getArticleId()), articleInfo);
//        response.setArticleInfo(articleInfo);
//        return response;
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PerformTransaction")
    @ResponsePayload
    public PerformTransactionResult performTransactionResult(@RequestPayload PerformTransactionArguments arguments){
        return new PerformTransactionResult();
    }

}
