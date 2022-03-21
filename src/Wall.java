import java.util.ArrayList;
import java.util.List;

public class Wall implements Structure {
    private List blocks ;

    public void setBlocks(List blocks) {
        this.blocks = blocks;
    }

    public List getBlocks() {
        return blocks;
    }
    public void addBlock(Block block){
        this.blocks.add(block);
    }
    public Block getBlock(int i){
        return (Block)blocks.get(i);
    }

    @Override
    public Block findBlockByColor(String color) {
        Block block = null;
        for (int i=0; i< blocks.size(); i++ ) {
            if (((Block)blocks.get(i)).getColor().equals(color)&&color!=null) {
                block=(Block)blocks.get(i);
            }
        }
        return block;
    }

    @Override
    public List findBlocksByMaterial(String material) {
        List list= new ArrayList();
        for (int i=0; i< blocks.size(); i++) {
            if ( ((Block)blocks.get(i)).getMaterial().equals(material)) {
                list.add(blocks.get(i));
            }
        }
        return list;
    }

    @Override
    public int count() {
        return blocks.size();
    }
    public void setBlock(String color,String material){
        String color1=color;
        String material1=material;
        blocks.add(new CompositeBlock() {
            @Override
            public List getBlocks() {
                return blocks;
            }

            String color=color1;
            String material=material1;

            @Override
            public String getColor() {
                return this.color;
            }

            @Override
            public String getMaterial() {
                return this.material;
            }
        });
    }



}




