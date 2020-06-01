package DataStructure.demo18;

public class BTNode {

        public Object data;
        public BTNode lChild, rChild;

        public BTNode() {
        this.lChild = null;
        this.rChild = null;
        this.data = null;
    }

        public BTNode(Object data, BTNode lChild, BTNode rChild) {
        this.data = data;
        this.lChild = lChild;
        this.rChild = rChild;
    }

        public BTNode(Object data) {
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }

        public Object getData () {
        return data;
    }

        public void setData (Object data){
        this.data = data;
    }

        public BTNode getlChild () {
        return lChild;
    }

        public void setlChild (BTNode lChild){
        this.lChild = lChild;
    }

        public BTNode getrChild () {
        return rChild;
    }

        public void setrChild (BTNode rChild){
        this.rChild = rChild;
    }
    }


