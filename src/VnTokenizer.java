import ai.vitk.tok.Tokenizer;
import ai.vitk.type.Token;

import javax.ws.rs.*;

import java.util.List;

// The Java class will be hosted at the URI path "/api/v2/vn_tokenizer"
@Path("/api/v2/vn_tokenizer/{comment: .+}")
public class VnTokenizer {
    // The Java method will process HTTP GET requests
    @GET
    //
    @Consumes("text/plain")
    // The Java method will produce content identified by the MIME Media type "application/json"
    @Produces("application/json")
    public String getClichedMessage(@PathParam("comment") String comment) {
        // Return some cliched textual content
        Tokenizer tokenizer = new Tokenizer();

        List<Token> words = tokenizer.tokenize(comment);

        return String.valueOf(words);
    }
}