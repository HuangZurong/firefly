package com.firefly.utils.json.serializer;

import java.io.IOException;

import com.firefly.utils.codec.Base64;
import com.firefly.utils.json.JsonWriter;
import com.firefly.utils.json.Serializer;

public class ByteArraySerializer implements Serializer {

	@Override
	public void convertTo(JsonWriter writer, Object obj)
			throws IOException {
		writer.writeStringWithQuote(Base64.encodeToString((byte[])obj, false));
	}

}
