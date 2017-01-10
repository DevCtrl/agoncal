package com.devctrl.agoncal.domain.jms;

import com.devctrl.agoncal.data.dto.OrderDTO;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.*;

/**
 * Created by rob on 10.01.17.
 */

@MessageDriven(mappedName = "jms/agoncal/Topic", activationConfig = {
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "messageSelector", propertyValue = "orderAmount > 1000")
})
@JMSConnectionFactoryDefinition(name = "jms/agoncal/ConnectionFactory", className = "javax.jms.ConnectionFactory")
@JMSDestinationDefinition(
        name = "jms/agoncal/Topic",
        className = "javax.jms.Topic",
        interfaceName = "javax.jms.Topic")
public class ExpensiveOrderMDB implements MessageListener{

    public void onMessage(Message message) {
        try {
            OrderDTO order = message.getBody(OrderDTO.class);
            System.out.println("Expensive order received: " + order.toString());
        } catch (JMSException e){
            e.printStackTrace();
        }
    }
}
