package skadistats.clarity.parser.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import skadistats.clarity.match.Match;
import skadistats.clarity.parser.Handler;
import skadistats.clarity.parser.HandlerHelper;
import skadistats.clarity.parser.RegisterHandler;

import com.dota2.proto.Netmessages.CNETMsg_SignonState;

@RegisterHandler(CNETMsg_SignonState.class)
public class NetSignonStateHandler implements Handler<CNETMsg_SignonState> {

    private final Logger log = LoggerFactory.getLogger(getClass());
    
    @Override
    public void apply(int peekTick, CNETMsg_SignonState message, Match match) {
        HandlerHelper.traceMessage(log, peekTick, message);
        log.debug("{} SIGNON_STATE",
            match.getReplayTimeAsString()
        );
        //TODO Handler
    }

}
