package util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import pl.piatekd.osrsprices.model.Response;
import pl.piatekd.osrsprices.model.ResponseObject;

public class ItemListDeserializer implements JsonDeserializer<Response> {

    @Override
    public Response deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = element.getAsJsonObject();
        List<ResponseObject> responseObjects = new ArrayList<ResponseObject>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
        	ResponseObject responseObject = context.deserialize(entry.getValue(), ResponseObject.class); 
            responseObjects.add(responseObject);
        }
        return new Response(responseObjects);
    }

}