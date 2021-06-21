package choral.examples.RetwisChoral;
import choral.annotations.Choreography;
import choral.runtime.Serializers.KryoSerializable;

@Choreography( role = "R", name = "Result" )
@KryoSerializable
public enum Result {
	OK, ERROR
}

